import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class listOfPredicates {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[]numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        BiFunction<Integer,Integer,Boolean> isDivision = (x,y)->x%y==0;

        for (int i = 1; i <=n ; i++) {
            boolean isItNum = true;
            for (int number : numbers) {
                if(isDivision.apply(i,number)==false){
                    isItNum=false;
                }
            }
            if(isItNum){
                System.out.print(i + " ");
            }
        }
    }
}
