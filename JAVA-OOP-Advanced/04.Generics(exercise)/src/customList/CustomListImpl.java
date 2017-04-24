package customList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomListImpl<P extends Comparable<P>> implements CustomList<P>{
    private List<P>list;

    public CustomListImpl(){
        this.list = new ArrayList<P>();
    }
    @Override
    public void add(P element) {
        this.list.add(element);
    }

    @Override
    public P removable(int index) {
        return this.list.remove(index);
    }

    @Override
    public boolean contains(P element) {
        boolean isContains = true;
        if(!list.contains(element)){
            isContains=false;
        }
        return isContains;
    }

    @Override
    public void swap(int index, int index1) {
        Collections.swap(list,index,index1);
    }

    @Override
    public int countGreaterThat(P element) {
        int count=0;
        for (P t : list) {
            if(t.compareTo(element)>0){
               count++;
            }
        }
        return count;
    }

    @Override
    public P getMax() {
        return  Collections.max(this.list,null);
    }

    @Override
    public P getMin() {
        return Collections.min(this.list,null);

    }

    @Override
    public void sort() {
        this.list.sort((a,b)->a.compareTo(b));
    }

    @Override
    public String toString() {
        StringBuilder bd =new StringBuilder();
        for (P p : list) {
            bd.append(p + "\n");
        }
        return bd.toString();
    }
}
