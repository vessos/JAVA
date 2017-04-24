package app.models.wastes;

import app.waste_disposal.annotations.Recyclable;

@Recyclable
public class RecyclableGarbage extends Garbage {

    public RecyclableGarbage(String name, double weight, double voluePerKg) {
        super(name, weight, voluePerKg);
    }


}
