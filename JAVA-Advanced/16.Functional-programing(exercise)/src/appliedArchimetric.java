import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class appliedArchimetric {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BiFunction<String,Integer,Integer> doMagic = (x,y)->{
            switch(x){
                case "add":
                    return y+1;
                case "multiply":
                    return y*2;
                case "subtract":
                    return y-1;
                default:
                    return null;
            }
        };
        Consumer<int[]> printThem = x->{
            StringBuilder sb = new StringBuilder();

            for (int i : x) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
        };
        int[]input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = "";
        while(!("end".equals(command=reader.readLine()))){

            if(!"print".equals(command)){

                for (int i = 0; i <input.length ; i++) {
                    input[i]=doMagic.apply(command,input[i]);
                }
            }else{
                printThem.accept(input);
            }
        }

    }
}
