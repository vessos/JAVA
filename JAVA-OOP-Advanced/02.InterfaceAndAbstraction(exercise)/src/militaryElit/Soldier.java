package militaryElit;

public abstract class Soldier implements ISoldier {
    private String firstName;
    private String lastName;
    private Integer id;

    protected Soldier(Integer id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    protected void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d",this.getFirstName(),this.getLastName(),this.getId());
    }
}
