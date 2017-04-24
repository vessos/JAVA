import java.util.ArrayDeque;
import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> stack = new ArrayDeque<>();

        ArrayDeque<Long> maxNumber = new ArrayDeque<>();

        long maxnum = Long.MIN_VALUE;

        for (int i = 0; i <number ; i++) {

            String[] array  = scanner.nextLine().split(" ");

            int command = Integer.parseInt(array[0]);
            if(command==1){
                long value =Long.parseLong(array[1]);
                stack.push(value);
                if(value>maxnum){
                    maxnum=value;
                    maxNumber.push(value);
                }
            }else if(command==2){
                long value1 =stack.pop();
                if(value1==maxnum){
                    maxNumber.pop();
                    if(maxNumber.size()!=0){
                        maxnum=maxNumber.peek();
                    }else{
                        maxnum=Long.MIN_VALUE;
                    }

                }
            }else{
                System.out.println(maxnum);
            }

        }
    }
}
