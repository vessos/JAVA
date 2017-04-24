package listUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
        Collections.addAll(list,1,2,null,3 ,3 ,null);
        System.out.println(ListUtils.getNullIndices(list));
    }
}
