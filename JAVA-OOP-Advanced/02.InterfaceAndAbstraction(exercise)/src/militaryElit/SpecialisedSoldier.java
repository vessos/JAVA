package militaryElit;

public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier {
    private String corps;

    protected SpecialisedSoldier(Integer id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }


    @Override
    public String getCorps() {
        return this.corps;
    }

    private void setCorps(String corps) {
        if(corps.equals("Airforces")||corps.equals("Marines")){
            this.corps = corps;
        }else{
            this.corps = "Invalid";
        }
    }

    @Override
    public String toString() {
        if(this.corps.equals("Invalid")){
            return super.toString();
        }else{
            return (super.toString()+"\nCorps: "+this.getCorps()).trim();
        }

    }
}
