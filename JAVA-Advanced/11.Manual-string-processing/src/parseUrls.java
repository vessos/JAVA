import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parseUrls {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        String[]reminder = input.split("://");

        if(reminder.length!=2){
            System.out.println("Invalid URL");
        }else{
            System.out.println(String.format("Protocol = %s",reminder[0]));
            int index = reminder[1].indexOf("/");
            String server = String.format("Server = %s", reminder[1].substring(0,index));
            System.out.println(server);
            String resources = reminder[1].substring(index+1);
            System.out.println(String.format("Resources = %s",resources));
        }




    }
}
