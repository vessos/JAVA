package warningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String line = reader.readLine();
        Logger logger = new Logger(Importance.valueOf(line));
        while(!"END".equals(line = reader.readLine())){
            String[]input = line.split(": ");
             logger.record(new Message(Importance.valueOf(input[0]),input[1]));
        }

        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }
        

    }
}

