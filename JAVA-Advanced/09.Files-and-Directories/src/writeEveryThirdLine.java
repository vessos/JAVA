import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class writeEveryThirdLine {
    public static void main(String[] args) {

        String inputPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\input.txt";
        String outputPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\output.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            PrintWriter writer = new PrintWriter(outputPath)){

            String line = reader.readLine();
            int counter = 1;
            while(line != null){
                if(counter%3==0){
                    writer.println(line);
                }
                counter++;
                line = reader.readLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
