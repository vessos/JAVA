package genericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;


public class Swap<T> {
    private List<T> list;

    public Swap(){
        this.list = new ArrayList<>();
    }

    public  void  addElement (T element){
        this.list.add(element);
    }

    public void swapElement(Integer firstElement,Integer secondElement){
        T element = this.list.get(firstElement);
        this.list.set(firstElement,this.list.get(secondElement));
        this.list.set(secondElement,element);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : list) {
            builder.append(t.getClass().getName()+ ": "+String.valueOf(t)+ "\n" );
        }

        return builder.toString();

    }
}
