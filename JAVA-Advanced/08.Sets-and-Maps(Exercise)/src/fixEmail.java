import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fixEmail {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name ="";

        while(!"stop".equals(name= reader.readLine())){

            String email = reader.readLine();

            boolean validator1 = email.endsWith(".us");
            boolean validator2 = email.endsWith(".uk");
            boolean validator3 = email.endsWith(".com");

            if(!validator1 && !validator2 && !validator3){
                System.out.println(name + " -> " + email);
            }

        }

    }
}
