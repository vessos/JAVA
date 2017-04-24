import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class palindromes {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]words = reader.readLine().split("[ ,?!\\.]+");
        TreeSet<String>palindrome = new TreeSet<>();

        for (String word : words) {
            boolean isPalindrome = true;
            for (int i = 0; i <word.length()/2 ; i++) {
                if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome){
                palindrome.add(word);
            }

        }
        System.out.println(palindrome);
    }
}
