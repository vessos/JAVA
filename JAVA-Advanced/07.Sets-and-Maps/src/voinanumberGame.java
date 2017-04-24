import java.util.LinkedHashSet;
import java.util.Scanner;

public class voinanumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input1 = scanner.nextLine().split(" ");
        String[]input2 = scanner.nextLine().split(" ");

        LinkedHashSet<Integer>firstPlayer =new LinkedHashSet<>();
        LinkedHashSet<Integer>secondPlayer =new LinkedHashSet<>();

        for (String s : input1) {
            firstPlayer.add(Integer.valueOf(s));
        }
        for (String s : input2) {
            secondPlayer.add(Integer.valueOf(s));
        }
        for (int i = 0; i <50; i++) {
            if(firstPlayer.isEmpty()||secondPlayer.isEmpty()){
                break;
            }
            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);
            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if(firstNumber>secondNumber){
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            }else if(secondNumber>firstNumber){
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }
        }
        if(firstPlayer.size()>secondPlayer.size()){
            System.out.println("First player win!");
        }else if(secondPlayer.size()>firstPlayer.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw");
        }
    }
}
