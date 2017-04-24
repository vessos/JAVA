import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class boundedNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int[]bound = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        List<Integer> bound = Stream.of(reader.readLine().split(" "))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());
        Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .filter(x->x>=bound.get(0)&&x<=bound.get(1))
                .forEach(a-> System.out.print(a + " "));
    }
}
