import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class findEvenOrOdd {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = reader.readLine();
        StringBuilder sb = new StringBuilder();

        BiFunction<String, Integer, Boolean> funcEven = (x, y) -> (("even".equals(x)) && (y % 2 == 0));
        BiFunction<String, Integer, Boolean> funcOdd = (x, y) -> (("odd".equals(x)) && (y % 2 != 0));
        for (int i = nums[0]; i <= nums[1]; i++) {
            if (funcEven.apply(command,i)) {
                sb.append(i).append(" ");
            }else if(funcOdd.apply(command,i)){
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb.toString().trim());

    }
}
