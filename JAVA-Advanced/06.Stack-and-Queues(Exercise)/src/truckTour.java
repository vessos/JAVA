import java.util.ArrayDeque;
import java.util.Scanner;

public class truckTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.valueOf(scanner.nextLine());
        ArrayDeque<String[]> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            queue.offer(input);
        }

        int countIndex = 0;
        long fuel = 0;
        boolean isCircle = true;


        for (int i = 0; i < N; i++) {
            String[] Index = queue.poll();
            Long amount = Long.parseLong(Index[0]);
            Long needPetrol = Long.parseLong(Index[1]);
            if (amount > needPetrol) {
                fuel = amount - needPetrol;
                for (int j = 0; j < N - 1; j++) {
                    String[] Index1 = queue.poll();
                    fuel += Long.parseLong(Index1[0]) - Long.parseLong(Index1[1]);
                    if (fuel < 0) {
                        isCircle = false;
                    }
                    queue.offer(Index1);
                }
            } else {
                isCircle = false;
            }
            if (isCircle == true && fuel > 0) {
                break;
            }
            countIndex++;
            fuel = 0;
            queue.offer(Index);
            isCircle = true;


        }
        System.out.println(countIndex);

    }
}
