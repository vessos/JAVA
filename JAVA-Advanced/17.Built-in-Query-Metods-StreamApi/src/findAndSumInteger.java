import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class findAndSumInteger {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> tokens = Arrays.asList(reader.readLine().split(" "));

        Optional<Integer>sum= tokens.stream()
                .filter(x -> isNumber(x))
                .map(Integer::valueOf)
                .reduce((x,y)->x+y);

        if(sum.isPresent()){
            System.out.println(sum.get());
        }else{
            System.out.println("No match");
        }
    }

    private static boolean isNumber(String x) {

        if (x.isEmpty()) {
            return false;
        }
        char[] characters = x.toCharArray();
        for (int i = 0; i <characters.length ; i++) {

            if(i==0){
                if(characters[i]=='-'||characters[i]=='+'){
                    continue;
                }
            }
            if(!Character.isDigit(characters[i])){
                return false;
            }

        }
        return true;
    }
}

