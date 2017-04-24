package app.models.wastes;

import app.waste_disposal.annotations.Storable;


@Storable
public class StorableGarbage extends Garbage {

    public StorableGarbage(String name, double weight, double voluePerKg) {
        super(name, weight, voluePerKg);
    }

}
