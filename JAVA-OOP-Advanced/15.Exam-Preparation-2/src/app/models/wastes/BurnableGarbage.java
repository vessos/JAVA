package app.models.wastes;


import app.waste_disposal.annotations.Burnable;

@Burnable
public class BurnableGarbage extends Garbage {

    public BurnableGarbage(String name, double weight, double voluePerKg) {
        super(name, weight, voluePerKg);
    }

}
