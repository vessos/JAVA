package app.models.wastes;

import app.waste_disposal.annotations.Toxic;

@Toxic
public class ToxicGarbage extends Garbage {

    protected ToxicGarbage(String name, double weight, double voluePerKg) {
        super(name, weight, voluePerKg);
    }
}
