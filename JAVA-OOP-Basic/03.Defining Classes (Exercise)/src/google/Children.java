package google;


public class Children {

    private String childName;
    private String childBirthday;

    public Children(String childName,String childBirthday){
        this.setChildName(childName);
        this.setChildBirthday(childBirthday);
    }

    private String getChildName() {
        return this.childName;
    }

    private void setChildName(String childName) {
        this.childName = childName;
    }

    private String getChildBirthday() {
        return this.childBirthday;
    }

    private void setChildBirthday(String childBirthday) {
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.getChildName(),this.getChildBirthday());
    }
}
