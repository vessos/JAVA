package customList;


public interface CustomList<T> {

    void add(T element);
    T removable(int index);
    boolean contains(T element);
    void swap(int index,int index1);
    int countGreaterThat(T element);
    T getMax();
    T getMin();
    void sort();


}
