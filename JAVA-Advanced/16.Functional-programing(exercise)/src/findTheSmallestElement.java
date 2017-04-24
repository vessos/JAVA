import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findTheSmallestElement {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer>integers = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

       Function<List<Integer>,Integer> minNumber = x->{
           int minN = Integer.MAX_VALUE;
           for (Integer integer : x) {
               if(integer<=minN){
                  minN=integer;
               }
           }
           return minN;
       };
        int pos = integers.lastIndexOf(minNumber.apply(integers));
        System.out.println(pos);
    }


}
