package mankind;

public class Student extends Human {

    private String facultyNumber;

    public Student(String firstName,String lastName,String facultyNumber){
        super(firstName,lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private String getFacultyNumber() {
        return this.facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) {
        if(facultyNumber.length()<5||facultyNumber.length()>10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return 	"First Name: " + this.getFirsName() + "\n" +
            	"Last Name: " + this.getLastName() + "\n" +
                "Faculty number: " + this.getFacultyNumber();
                }
}

