import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class extractInteger {
    public static void main(String[] args) {

        String inputPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\input.txt";
        String outputPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\output.txt";

        try(Scanner scanner = new Scanner(new FileInputStream(inputPath));
            PrintWriter writer = new PrintWriter(outputPath)) {
            while(scanner.hasNext()){
                if(scanner.hasNextInt()){
                    writer.println(scanner.nextInt());
                }

                scanner.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
