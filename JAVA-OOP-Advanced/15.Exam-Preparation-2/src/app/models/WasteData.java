package app.models;

import app.waste_disposal.contracts.ProcessingData;

/**
 * Created by MARK-Max on 23/04/2017.
 */
public class WasteData implements ProcessingData {
    private double energyBalance;
    private double capitalBalance;

    public WasteData(double energyBalance, double capitalBalance) {
        this.energyBalance = energyBalance;
        this.capitalBalance = capitalBalance;
    }

    @Override
    public double getEnergyBalance() {
        return this.energyBalance;
    }

    @Override
    public double getCapitalBalance() {
        return this.capitalBalance;
    }
}
