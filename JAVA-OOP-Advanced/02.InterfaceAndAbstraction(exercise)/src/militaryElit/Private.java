package militaryElit;

public class Private extends Soldier implements IPrivate{

    private Double salary;

    public Private(Integer id, String firstName, String lastName,Double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }


    @Override
    public String toString() {
        return super.toString()+String.format(" Salary: %.2f",this.getSalary());
    }

}
