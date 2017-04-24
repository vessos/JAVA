package app.core;

import app.waste_disposal.contracts.ProcessingData;

public class BalanceMenagerImpl implements BalanceMenager{

    private double energyBalance;
    private double capitalBalance;

    public void processData(ProcessingData processingData){
        this.energyBalance+=processingData.getEnergyBalance();
        this.capitalBalance+=processingData.getCapitalBalance();
    }

    public double getEnergyBalance() {
        return this.energyBalance;
    }

    public double getCapitalBalance() {
        return this.capitalBalance;
    }
}
