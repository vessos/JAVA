package mankind;

public class Worker extends Human {

    private double Salary;
    private double workingHours;

    public Worker(String firstName,String lastName,double salary,double workingHours){

        super(firstName,lastName);
        this.setSalary(salary);
        this.setWorkingHours(workingHours);

    }
    @Override
    protected void setLastName(String lastName){
        if(lastName.length()<4){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    private double getSalary() {
        return this.Salary;
    }

    private double getWorkingHours() {
        return this.workingHours;
    }

    private void setSalary(double salary) {
        if(salary<10.00){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        Salary = salary;
    }

    private void setWorkingHours(double workingHours) {
        if(workingHours<1||workingHours>12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workingHours = workingHours;
    }

    private double salaryPerHour(){
        double salaryPerHour = this.Salary/this.workingHours/7;
        return salaryPerHour;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nWeek Salary: %.2f%nHours per day: %.2f%nSalary per hour: %.2f%n",this.getFirsName(),this.getLastName(),this.getSalary(),this.getWorkingHours(),this.salaryPerHour());

    }
}
