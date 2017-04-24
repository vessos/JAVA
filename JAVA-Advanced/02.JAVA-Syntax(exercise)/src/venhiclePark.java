import java.util.ArrayList;
import java.util.Scanner;

public class venhiclePark {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] venhicle = scanner.nextLine().split(" ");

        String[] request = scanner.nextLine().split(" ");

        int venhicleSold =0;
        int count=0;

        while(!request[0].equals("End")){
            String car = request[0].toLowerCase();
            char car1 = car.charAt(0);
            boolean havecar=false;
            for (int i = 0; i <venhicle.length ; i++){
                String s =venhicle[i];
                String p = s.substring(1,s.length());
                int seats = Integer.parseInt(p);
                int seats1=Integer.parseInt(request[2]);
                if(car1==s.charAt(0)&&seats1==seats){
                    long sum = (int)s.charAt(0)*seats;
                    System.out.printf("Yes, sold for %d$",sum);
                    System.out.println();
                    havecar=true;
                    venhicleSold++;
                    venhicle[i]="00";
                    count++;
                    break;
                }
            }
            if(!havecar){
                System.out.println("No");
            }

            request = scanner.nextLine().split(" ");
            
        }
        String [] venhicleLeft = new String[venhicle.length-count];
        int count1=0;
        for (String s : venhicle) {
            if(!s.equals("00")){
                venhicleLeft[count1]=s;
                count1++;
            }
        }
        String join1 =String.join(", ",venhicleLeft);
        System.out.printf("Vehicles left: %s",join1);
        System.out.println();
        System.out.printf("Vehicles sold: %d",venhicleSold);


    }
}
