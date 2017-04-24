import java.util.HashSet;
import java.util.Scanner;

public class parkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> hashSet = new HashSet<>();

        String[] input = scanner.nextLine().split(", ");

        while(!input[0].equals("END")){
            String depo = input[0];
            String carNumber = input[1];

            if(depo.equals("IN")){
                hashSet.add(carNumber);
            }else if(depo.equals("OUT")){
                hashSet.remove(carNumber);
            }

            input = scanner.nextLine().split(", ");
        }

        if(hashSet.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for (String s : hashSet) {
                System.out.println(s);
            }
        }
    }
}
