package app.models.strategies;


import app.models.WasteData;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

public class RecyclableGarbageDisposableStrategy implements GarbageDisposalStrategy{

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double volume = garbage.getVolumePerKg()*garbage.getWeight();
        double energyBalance = -1*volume*0.5;
        double capitalBalance = 400*garbage.getWeight();

        return new WasteData(energyBalance,capitalBalance);
    }
}
