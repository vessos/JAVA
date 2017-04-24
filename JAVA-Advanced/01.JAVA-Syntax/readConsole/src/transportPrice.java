import java.math.BigDecimal;
import java.util.Scanner;

public class transportPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        String type = scanner.next();

        double taxiInitialTax = 0.70;
        double taxiDay = 0.79;
        double taxiNight = 0.90;
        double trainTax = 0.06;
        double busTax = 0.09;

        BigDecimal priceForTransport=new BigDecimal("0");

        if(type.equals("day") && km<20){
            priceForTransport=new BigDecimal(taxiInitialTax+km*taxiDay);
        }else if(type.equals("night") && km<20){
            priceForTransport=new BigDecimal(taxiInitialTax+km*taxiNight);
        }else if(km>=20&&km<100){
            priceForTransport=new BigDecimal(busTax*km);
        }else if(km>=100){
            priceForTransport=new BigDecimal(trainTax*km);
        }

        System.out.printf("%.2f",priceForTransport);
    }
}
