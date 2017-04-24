import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class reverseAndExclude {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[]numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<String>elements = new ArrayList<>();

        int num = Integer.parseInt(reader.readLine());

        Function<Integer,Boolean>subtractN = x->x%num!=0;

        for (Integer element : numbers) {
            if((subtractN.apply(element))){
                elements.add(String.valueOf(element));
            }
        }
        Collections.reverse(elements);

        String joined = String.join(" ",elements);
        System.out.println(joined);
    }
}
