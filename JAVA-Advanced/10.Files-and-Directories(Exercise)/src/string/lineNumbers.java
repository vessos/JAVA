package string;


import java.io.*;

public class lineNumbers {

    private final static String pathIn = "/src/resources/index.txt";
    private final static String pathOut = "/src/resources/output.txt";

    public static void main(String[] args) {

        final String generalPath = System.getProperty("user.dir");

        final String inputPath = generalPath + pathIn;
        final String outputPath = generalPath + pathOut;

        try(BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {

            String line = reader.readLine();
            int count = 1;
            while(line!=null){
                writer.println(count+". "+line);
                count++;
                line=reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
