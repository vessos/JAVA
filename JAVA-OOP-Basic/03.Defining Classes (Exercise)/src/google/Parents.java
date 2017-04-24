package google;

public class Parents {

    private String parentName;
    private String parentBirthday;

    public Parents(String parentName,String parentBirthday){
        this.setParentName(parentName);
        this.setParentBirthday(parentBirthday);

    }

    private String getParentName() {
        return this.parentName;
    }

    private void setParentName(String parentName) {
        this.parentName = parentName;
    }

    private String getParentBirthday() {
        return this.parentBirthday;
    }

    private void setParentBirthday(String parentBirthday) {
        this.parentBirthday = parentBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.getParentName(),this.getParentBirthday());
    }
}
