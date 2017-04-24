package tuple;

public class Tuple<T,K>{
    private T item1;
    private K item2;

    public Tuple(T item1,K item2){
        this.item1 = item1;
        this.item2 = item2;
    }

    private T getItem1() {
        return this.item1;
    }

    private K getItem2() {
        return this.item2;
    }

    @Override
    public String toString() {
        return getItem1() + " -> " + getItem2() ;
    }
}
