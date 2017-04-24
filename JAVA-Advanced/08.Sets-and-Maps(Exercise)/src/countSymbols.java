import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class countSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        TreeMap<Character,Integer> charackters = new TreeMap<>();

        for (int i = 0; i <text.length() ; i++) {
            char key = text.charAt(i);
            if(!charackters.containsKey(key)){
                charackters.put(key,1);
            }else{
                int count = charackters.get(key);
                charackters.put(key,count+=1);
            }
        }

        for (Character key : charackters.keySet()) {
            System.out.println(key +": "+charackters.get(key)+" time/s");
        }
    }
}
