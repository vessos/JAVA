package google;


public class Company {

    private String companyName;
    private String department;
    private double salary;

    public Company(){

    }

    public Company(String companyName,String department,double salary){
        this.setCompanyName(companyName);
        this.setDepartment(department);
        this.setSalary(salary);
    }

    private String getCompanyName() {
        return this.companyName;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private String getDepartment() {
        return this.department;
    }

    private void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",this.getCompanyName(),this.getDepartment(),this.getSalary());
    }
}
