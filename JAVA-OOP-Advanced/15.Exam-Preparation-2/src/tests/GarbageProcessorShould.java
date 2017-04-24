package tests;

import app.waste_disposal.DefaultGarbageProcessor;
import app.waste_disposal.annotations.Disposable;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.StrategyHolder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import tests.fakes.DisposableAnotation;
import tests.fakes.DisposableWaste;
import tests.fakes.NonDisposableWaste;
import tests.fakes.NoneAnotationWaste;

public class GarbageProcessorShould {

    private DefaultGarbageProcessor garbageProcessor;
    private StrategyHolder strategyHolderMock;
    private ProcessingData processingDataMock;
    private GarbageDisposalStrategy garbageDisposalStrategyMock;

    @Before
    public void initialize(){
        this.strategyHolderMock = Mockito.mock(StrategyHolder.class);
        this.garbageProcessor = new DefaultGarbageProcessor(this.strategyHolderMock);
        this.strategyHolderMock.addStrategy(DisposableAnotation.class,garbageDisposalStrategyMock);
        this.processingDataMock = Mockito.mock(ProcessingData.class);
        this.garbageDisposalStrategyMock = Mockito.mock(GarbageDisposalStrategy.class);
    }

    @Test
    public void returnStrategyHolderIfPresent(){
        Assert.assertEquals(this.strategyHolderMock,this.garbageProcessor.getStrategyHolder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenNonDisposableWasteInProcessed(){
        this.garbageProcessor.processWaste(new NonDisposableWaste());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwWhenNonAnnotatedWasteInProcessed(){
        this.garbageProcessor.processWaste(new NoneAnotationWaste());
    }

    @Test
    public void returnProcessingDataIfDisposableWastePassed(){
        //arrange
        Mockito.when(this.garbageDisposalStrategyMock.processGarbage(Mockito.isA(DisposableWaste.class)))
                .thenReturn(this.processingDataMock);
        Mockito.when(garbageProcessor.processWaste(Mockito.isA(DisposableWaste.class)))
                .thenReturn(this.processingDataMock);

        //act
        ProcessingData result = this.garbageProcessor.processWaste(new DisposableWaste());

        //assert
        Assert.assertSame(this.processingDataMock,result);
    }


}
