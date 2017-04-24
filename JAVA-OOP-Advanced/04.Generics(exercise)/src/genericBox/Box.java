package genericBox;


public class Box<T> {

    private T value;

    public Box(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        String type = String.valueOf(value.getClass()).substring(6);
        return type + ": "+value ;
    }
}
