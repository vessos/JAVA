import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class upperStrings {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Arrays.stream(reader.readLine().split(" "))
         .map(x->x.toUpperCase())
         .forEach(s-> System.out.print(s+ " "));



    }
}
