import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class characterMultiplier {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split(" ");

        StringBuilder word1 = new StringBuilder(words[0]);
        StringBuilder word2 = new StringBuilder(words[1]);
        int maxLenght = Math.max(word1.length(),word2.length());

        int sum = 0;

        for (int i = 0; i <maxLenght ; i++) {

            int c1 = 1;
            int c2 = 1;
            if(word1.length()>i){
                c1 = Integer.valueOf(word1.charAt(i));
            }
            if(word2.length()>i){
                c2 = Integer.valueOf(word2.charAt(i));
            }

            sum+= c1*c2;
        }

        System.out.println(sum);
    }
}
