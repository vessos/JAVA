import java.util.ArrayDeque;
import java.util.Scanner;

public class basicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []index = scanner.nextLine().split(" ");

        int poolElements = Integer.parseInt(index[1]);
        int haveElement = Integer.parseInt(index[2]);

        String[]num = scanner.nextLine().split(" ");

        ArrayDeque<Integer>queue = new ArrayDeque<>();

        int minNumbers = Integer.MAX_VALUE;

        for (String s : num) {
            queue.offer(Integer.valueOf(s));
        }

        for (int i = 0; i < poolElements; i++) {
            queue.poll();
        }
        if(queue.contains(haveElement)){
            System.out.println("true");
        }else if(queue.size()>0){
            for (Integer integer : queue) {
                if(integer<minNumbers){
                    minNumbers=integer;
                }
            }
            System.out.println(minNumbers);
        }else{
            System.out.println("0");
        }
    }
}
