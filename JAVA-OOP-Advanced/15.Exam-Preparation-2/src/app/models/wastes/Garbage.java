package app.models.wastes;

import app.waste_disposal.contracts.Waste;

public abstract class Garbage implements Waste {

    private String name;
    private double weight;
    private double voluePerKg;

    protected Garbage(String name, double weight, double voluePerKg) {
        this.name = name;
        this.weight = weight;
        this.voluePerKg = voluePerKg;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getVolumePerKg() {
        return this.voluePerKg;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
