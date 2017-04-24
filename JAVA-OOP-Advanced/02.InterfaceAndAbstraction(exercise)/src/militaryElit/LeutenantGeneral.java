package militaryElit;

import java.util.LinkedHashSet;

public class LeutenantGeneral extends Private implements ILeutenantGeneral{
    private LinkedHashSet<Private> soldiers;
    public LeutenantGeneral(Integer id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary);
        this.soldiers = new LinkedHashSet<>();
    }

    @Override
    public String toString() {
        String privates ="";
        for (Private soldier : soldiers) {
           privates+=" "+soldier.toString()+"\n";
        }
        return (super.toString() + "\nPrivates:\n"+privates).trim();
    }

    @Override
    public void setSoldiers(Private idSoldier) {
        this.soldiers.add(idSoldier);
    }


}

