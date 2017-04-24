import java.util.*;

public class robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robotsTokens = scanner.nextLine().split(";");
        String[] robots = new String[robotsTokens.length];
        int[] processTimes = new int [robotsTokens.length];
        int[] robotsCount = new int[robotsTokens.length];

        for (int i = 0; i <robotsTokens.length ; i++) {
            String[]robotsToken = robotsTokens[i].split("-");
            robots[i]=robotsToken[0];
            processTimes[i]= Integer.parseInt(robotsToken[1]);
        }


        String[] time = scanner.nextLine().split(":");

        long h = Integer.parseInt(time[0])*60*60;
        long m = Integer.parseInt(time[1])*60;
        long s = Integer.parseInt(time[2]);

        long seconds = h+m+s;

        Deque<String>products = new ArrayDeque<>();

        String detail = scanner.nextLine();

        while(!detail.equals("End")) {
            products.offer(detail);
            detail = scanner.nextLine();
        }
        
        while(!products.isEmpty()){
            seconds++;
            for (int i = 0; i <robots.length ; i++) {
                if(robotsCount[i]>0){
                   robotsCount[i]--;
                }
            }
            String currentProduct = products.poll();
            boolean isProductTaken = false;
            for (int i = 0; i <robots.length ; i++) {
                if(robotsCount[i]==0){
                    robotsCount[i]=processTimes[i];
                    isProductTaken = true;
                    System.out.printf("%s - %s [%s]%n",robots[i],currentProduct,getCurrentTime(seconds));
                    break;
                }

            }
            if(!isProductTaken){
                products.offer(currentProduct);
            }
        }

    }
    private static String getCurrentTime(long currentSeconds) {
        long hours = ((int) (currentSeconds / 3600)) % 24;
        long remainder = currentSeconds % 3600;
        long minutes = remainder / 60;
        long seconds = remainder % 60;

        String currentTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        return currentTime;
    }

}
