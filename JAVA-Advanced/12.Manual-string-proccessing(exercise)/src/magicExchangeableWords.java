import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class magicExchangeableWords {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character,Character>chars = new HashMap<>();

        List<String> words = Arrays.stream(reader.readLine().split(" ")).map(String::valueOf).collect(Collectors.toList());
        words.sort((a,b)->Integer.compare(a.length(),b.length()));

        String word1 = words.get(0);
        String word2 = words.get(1);
        boolean isExchangeble =true;


        for (int i = 0; i <word1.length(); i++) {

            if(!chars.containsKey(word1.charAt(i))){
                chars.put(word1.charAt(i),word2.charAt(i));
            }else {
                if(!chars.get(word1.charAt(i)).equals(word2.charAt(i))){
                    isExchangeble=false;
                }
            }
        }
        String piece = word2.substring(word1.length());
        for (int i = 0; i <piece.length() ; i++) {
            if(!chars.containsValue(piece.charAt(i))){
                isExchangeble = false;
            }
        }

        System.out.println(isExchangeble);
    }
}
