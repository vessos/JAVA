package borderControl;

public abstract class BasePerson implements Person {
    private String id;

    public BasePerson(String id){
        this.id =id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean checkId(String num) {
        if(this.id.endsWith(num)){
            return true;
        }else{
            return false;
        }
    }
}
