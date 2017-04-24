import java.util.ArrayDeque;
import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String palindromeCandidate = scanner.nextLine();

        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (Character ch : palindromeCandidate.toCharArray()) {
            queue.offer(ch);
        }

        boolean isPalindrome =true;

        while(queue.size()>1){

            char leftSimbol = queue.poll();
            char rightSimbol= queue.pollLast();

            if(leftSimbol!=rightSimbol){
                isPalindrome=false;
                break;
            }

        }

            System.out.println(isPalindrome);

    }
}
