package militaryElit;

public class Spy extends Soldier implements ISpy {
    private Integer codeNumber;
    public Spy(Integer id, String firstName, String lastName,Integer codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }


    @Override
    public String toString() {
        return (super.toString()+"\nCode Number: "+this.codeNumber).trim();

    }

}
