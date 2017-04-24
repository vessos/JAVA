package genericCountMethodString;


import java.util.ArrayList;
import java.util.List;

public class BoxImpl<T extends Comparable<T> > implements Box<T>{

    private final static int COUNT = 0;
    private int count;
    private List<T> list;

    public BoxImpl(){
        this.list = new ArrayList<T>();
        this.count = COUNT;
    }

    private int getCount() {
        return this.count;
    }
    @Override
    public void  addElement (T element){
        this.list.add(element);
    }
    @Override
    public void compare(T element){
        for (T t : list) {
            if(t.compareTo(element)>0){
                this.count++;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%d",this.getCount());
    }
}
