package mankind;

public class Human {

    private String firsName;
    private String lastName;

    public Human(String firsName,String lastName){
        this.setFirsName(firsName);
        this.setLastName(lastName);
    }

    protected String getFirsName() {
        return this.firsName;
    }

    protected void setFirsName(String firsName) {
        if(!String.valueOf(firsName.charAt(0)).equals(String.valueOf(firsName.charAt(0)).toUpperCase())){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if(firsName.length()<4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.firsName = firsName;
    }

    protected String getLastName() {
        return this.lastName;
    }

    protected void setLastName(String lastName) {
        if(!String.valueOf(lastName.charAt(0)).equals(String.valueOf(lastName.charAt(0)).toUpperCase())){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        if(lastName.length()<3){
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName = lastName;
    }
}
