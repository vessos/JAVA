import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class predicateForNames {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.valueOf(reader.readLine());

        String[]names = reader.readLine().split(" ");

        Function<String,Boolean> isTrue = x->x.length()<=num;

        for (String name : names) {
            if(isTrue.apply(name)){
                System.out.println(name);
            }
        }
    }
}
