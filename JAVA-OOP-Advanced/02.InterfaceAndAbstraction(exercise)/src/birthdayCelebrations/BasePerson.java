package birthdayCelebrations;

public abstract class BasePerson implements Person {
    private String name;
    private String birthday;

    public BasePerson(String name,String birthday){
        this.name =name;
        this.birthday = birthday;
    }

    @Override
    public String getBirthDay() {
        return this.birthday;
    }

    @Override
    public boolean checkBirthday(String check) {
        if(check.equals(this.birthday.substring(6))){
            return true;
        }else{
            return false;
        }

    }
}
