import java.util.HashMap;
import java.util.Scanner;

public class phoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("-");

        HashMap<String,String>phonebook=new HashMap<>();

        while(!input[0].equals("search")){
            phonebook.put(input[0],input[1]);
            input = scanner.nextLine().split("-");
        }

        String name = scanner.nextLine();
        while(!name.equals("stop")){
            if(phonebook.containsKey(name)){
                System.out.println(name+" -> "+ phonebook.get(name));
            }else{
                System.out.println("Contact "+name +" does not exist.");
            }
            name = scanner.nextLine();
        }


    }
}
