import java.util.ArrayDeque;
import java.util.Scanner;

public class basicStackOperation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        String [] operators = scanner.nextLine().split(" ");

        String [] numbers = scanner.nextLine().split(" ");

        int pushElements = Integer.parseInt(operators[0]);
        int popElements = Integer.parseInt(operators[1]);
        int haveElement = Integer.parseInt(operators[2]);

        ArrayDeque<Integer>stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(Integer.valueOf(number));
        }
        int minNumbers = Integer.MAX_VALUE;
        boolean haveNumberinStack = false;
        for (int i =0; i <popElements ; i++) {
            stack.pop();
        }
        if(!stack.isEmpty()){
            while(stack.size()>0){

                if(stack.contains(haveElement)){
                    System.out.println("true");
                    break;
                }
                int num = stack.pop();
                if(num<minNumbers){
                    minNumbers=num;
                }
                haveNumberinStack=true;
            }
            if(haveNumberinStack){
                System.out.println(minNumbers);
            }

        }else{
            System.out.println("0");
        }

    }


}
