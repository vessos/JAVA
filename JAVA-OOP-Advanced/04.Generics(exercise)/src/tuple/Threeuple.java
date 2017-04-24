package tuple;

/**
 * Created by MARK-Max on 20/03/2017.
 */
public class Threeuple<V> extends Tuple {
    private V item3;

    public Threeuple(Object item1, Object item2,V item3) {
        super(item1, item2);
        setItem3(item3);

    }

    public V getItem3() {
        return this.item3;
    }

    private void setItem3(V item3) {
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + getItem3();
    }
}
