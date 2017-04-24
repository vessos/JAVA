import java.util.HashMap;
import java.util.Scanner;

public class countSameValuesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]input = scanner.nextLine().split(" ");

        HashMap<String,Integer>results = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            if(!results.containsKey(input[i])){
               results.put(input[i],1);
            }else{
                int count = results.get(input[i]);
                results.put(input[i],count+=1);
            }
        }

        for (String key : results.keySet()) {
            System.out.println(key+" - "+results.get(key)+" times");
        }
    }
}
