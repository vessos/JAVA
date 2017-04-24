import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class averageOfDouble {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> tokens = Arrays.asList(reader.readLine().split(" "));

        DoubleStream stream = tokens.stream()
                .filter(x-> !x.isEmpty())
                .mapToDouble(x -> Double.valueOf(x));

        OptionalDouble result = stream.average();

        if(result.isPresent()){
            System.out.printf("%.2f",result.getAsDouble());
        }else{
            System.out.println("No match");
        }


    }
}
