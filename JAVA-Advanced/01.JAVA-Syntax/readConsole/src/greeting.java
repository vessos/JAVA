import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if((name1.equals("")) && (name2.equals(""))){
            System.out.println("Hello, ***** *****!" );
        }
        else if(name2.equals("")){
            System.out.println("Hello, "+ name1+" *****!");
        }
        else if(name1.equals("")){
            System.out.println("Hello, ***** " + name2+"!");
        }
        else {
            System.out.println("Hello, "+name1+" "+name2+"!");
        }
    }
}
