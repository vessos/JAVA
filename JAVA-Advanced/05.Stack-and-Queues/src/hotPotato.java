import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class hotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[]index = scanner.nextLine().split(" ");

        ArrayDeque<String>queue = new ArrayDeque<>();

        Collections.addAll(queue,index);

        int n = Integer.parseInt(scanner.nextLine());

        while(queue.size()>1){
            for (int i = 1; i <n ; i++) {
                String firstChild = queue.poll();
                queue.offer(firstChild);
            }
            System.out.println("Removed "+queue.poll());
        }
        System.out.println("Last is "+queue.poll());

    }
}
