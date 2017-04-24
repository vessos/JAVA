import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class customComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

       numbers.sort((a,b)->compare(a,b));
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
    public static int compare(Integer o1, Integer o2) {
        if (o1 % 2 ==0)
        {
            if (o2 % 2 == 0)
            {
                if (o1 < o2)
                    return -1;
                else
                    return 1;
            }
            //if (o2 % 2 != 0)
            else
            {
                return -1;
            }
        }
        else
        {
            if (o2 % 2 != 0)
            {
                if (o1 < o2)
                    return -1;
                else
                    return 1;
            }
            //if (o2 % 2 == 0)
            else
            {
                return 1;
            }
        }
    }

}
