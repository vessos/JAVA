package militaryElit;

import java.util.LinkedHashSet;

public class Engineer extends SpecialisedSoldier implements IEngineer {
    private LinkedHashSet<Repair> repairs;


    public Engineer(Integer id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new LinkedHashSet<>();
    }

    @Override
    public void addRepairPart(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        String repair = "";
        if(!this.repairs.isEmpty()){
            for (Repair repair1 : repairs) {
                    repair+=" "+repair1+"\n";
            }
        }
        return (super.toString() + "\nRepairs:\n" + repair).trim();
    }
}
