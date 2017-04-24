package liaryIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator<T> implements Iterables<T> {
    private List<T> list;
    private int counter;

    public ListyIterator(T... list) {
        this.list = Arrays.asList(list);
        this.counter = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }


    public boolean HasNext() {
        return iterator().hasNext();
    }

    @Override
    public void PrintAll() {
        for (T t : this) {
            System.out.print(t + " ");
        }
        ;System.out.println();
    }

    public boolean Move() {
        if (iterator().hasNext()) {
            iterator().next();
            return true;
        }else{
            return false;
        }

    }

    public void Print() {
        if (list.isEmpty()||list==null) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        System.out.println(list.get(counter));
    }

    private final class ListIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            if (list.size() - 1 <= counter) {
                return false;
            } else {
                return true;
            }

        }

        @Override
        public T next() {

            return list.get(counter++);
        }


    }
}
