package stackIterator;

import java.util.*;

public class Stack<T> implements Iterable<T> {

    private List<T>Stacklist ;
    private int index;

    public Stack() {
        this.Stacklist = new ArrayList<T>();
        this.index = Stacklist.size()-1;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    public void Push(T...list){
        for (T t : list) {
            this.Stacklist.add(t);
            index++;
        }

    }

    public void Pop(){
        if(index<0){
            throw new IllegalArgumentException("No elements");
        }
        this.Stacklist.remove(index);
        index--;
    }


    private final class StackIterator implements Iterator<T>{

        private int count;
        private StackIterator(){
            this.count = Stacklist.size()-1;
        }
        @Override
        public boolean hasNext() {
            return 0<=count;
        }

        @Override
        public T next() {

            return Stacklist.get(count--);
        }
    }
}
