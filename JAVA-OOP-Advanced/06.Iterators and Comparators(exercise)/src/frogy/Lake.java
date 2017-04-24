package frogy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake<Long> implements Iterable<Long> {
    private List<Long>list;

    public Lake () {
        this.list = new ArrayList<>();


    }
    public void addElement(Long...elements){
        for (Long element : elements) {
           list.add(element);
        }
    }
    @Override
    public Iterator<Long> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<Long>{

        private int index = 0;
        @Override
        public boolean hasNext() {
            return list.size()>index;
        }

        @Override
        public Long next() {
            return list.get(index++);
        }
    }
}
