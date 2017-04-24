import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class gameOfNames {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int numberOfGamer = Integer.parseInt(scanner.nextLine());

        String nameOfWinner = "";

        BigInteger maxScore = new BigInteger("0");

        for (int i = 0; i <numberOfGamer*2 ; i+=2) {
            String nameOfPlayer = scanner.nextLine();
            int point = Integer.parseInt(scanner.nextLine());
            BigInteger newPoint = BigInteger.valueOf(point);

            for (int j = 0; j <nameOfPlayer.length() ; j++) {
                int charValue = (int)nameOfPlayer.charAt(j);
                if(charValue%2==0){
                    newPoint=newPoint.add(BigInteger.valueOf(charValue));
                }else{
                    newPoint=newPoint.subtract(BigInteger.valueOf(charValue));
                }
            }
            if(newPoint.compareTo(maxScore)>=0){
                maxScore=newPoint;
                nameOfWinner=nameOfPlayer;
            }

        }

        System.out.printf("The winner is %s - %d points",nameOfWinner,maxScore);

    }
}
