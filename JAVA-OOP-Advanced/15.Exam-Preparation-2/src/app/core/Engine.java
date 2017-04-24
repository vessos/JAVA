package app.core;


import app.io.Reader;
import app.io.Writer;
import app.models.strategies.BurnableGarbageDisposableStrategy;
import app.models.strategies.RecyclableGarbageDisposableStrategy;
import app.models.strategies.StorableGarbageDisposableStrategy;
import app.models.wastes.BurnableGarbage;
import app.models.wastes.RecyclableGarbage;
import app.models.wastes.StorableGarbage;
import app.waste_disposal.annotations.Burnable;
import app.waste_disposal.annotations.Recyclable;
import app.waste_disposal.annotations.Storable;
import app.waste_disposal.contracts.GarbageProcessor;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;


public class Engine implements Runnable {

    private Reader reader;
    private Writer writer;
    private GarbageProcessor garbageProcessor;
    private BalanceMenager balanceMenager;

    @Override
    public void run() {

        this.addStrategies();

        String line = "";

        while(!"TimeToRecycle".equals(line = reader.read())){

            String[]cmdArgs = line.split("\\s+");
            String cmdType = cmdArgs[0];
            switch (cmdType){
                case"ProcessGarbage":
                    processGarbage(cmdArgs[1]);
                    break;
                case"Status":
                    this.writer.write(String.format("Energy: %.2f Capital: %.2f",this.balanceMenager.getEnergyBalance(),this.balanceMenager.getCapitalBalance()));
                    break;
                default:
                    this.writer.write("Invalid command");
            }
        }
    }

    private void addStrategies() {
        this.garbageProcessor.getStrategyHolder()
                .addStrategy(Burnable.class,new BurnableGarbageDisposableStrategy());
        this.garbageProcessor.getStrategyHolder()
                .addStrategy(Recyclable.class,new RecyclableGarbageDisposableStrategy());
        this.garbageProcessor.getStrategyHolder()
                .addStrategy(Storable.class,new StorableGarbageDisposableStrategy());
    }

    private void processGarbage(String parameters) {

        String[] args = parameters.split("\\|");
        String name = args[0];
        Double weight = Double.valueOf(args[1]);
        Double volumePerKg = Double.valueOf(args[2]);
        String type = args[3];

        Waste waste = null;
        switch (type) {
            case "Recyclable":
                waste = new RecyclableGarbage(name, weight, volumePerKg);
                break;
            case "Burnable":
                waste = new BurnableGarbage(name, weight, volumePerKg);
                break;
            case "Storable":
                waste = new StorableGarbage(name, weight, volumePerKg);
                break;

        }


        ProcessingData processingData = this.garbageProcessor.processWaste(waste);
        this.balanceMenager.processData(processingData);
        this.writer.write(String.format("%.2f kg of %s successfully processed!",weight,name));
    }
}
