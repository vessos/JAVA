import java.util.Scanner;

public class firstOddAndEventElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        String [] command = scanner.nextLine().split(" ");

        int number = Integer.parseInt(command[1]);
        String type = command[2];

        Print(elements,type,number);



    }
    public static void Print (String[]elements,String type,int number){
        int count=0;
        for (int i = 0; i <elements.length ; i++) {
            if(type.equals("odd")){
                int num = Integer.parseInt(elements[i]);
                if(num%2!=0&&count<number){
                    System.out.print(num+" ");
                    count++;
                }
            }else{
                int num = Integer.parseInt(elements[i]);
                if(num%2==0&&count<number){
                    System.out.print(num+" ");
                    count++;
                }
            }
        }
    }

}
