import java.util.ArrayDeque;
import java.util.Scanner;

public class sequenceWhitQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Long N = Long.parseLong(scanner.nextLine());

        ArrayDeque<Long>queue= new ArrayDeque<>();
        queue.offer(N);

        for (int i = 0; i <49 ; i+=3) {
            Long number = queue.peek();
                Long S2 = number+1;
                queue.offer(S2);
                Long S3=2*number+1;
                queue.offer(S3);
                Long S4 = number+2;
                queue.offer(S4);
            System.out.print(queue.poll()+" ");

        }
        int P = queue.size();
        for (int i = 0; i <P-2; i++) {
            System.out.print(queue.poll()+" ");
        }

    }
}

