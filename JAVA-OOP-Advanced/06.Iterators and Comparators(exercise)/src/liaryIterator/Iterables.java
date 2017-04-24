package liaryIterator;

import java.util.Iterator;

public interface Iterables<T> extends Iterable<T> {


    boolean Move();

    void Print();

    boolean HasNext();

    void PrintAll();

    Iterator<T> iterator();


}
