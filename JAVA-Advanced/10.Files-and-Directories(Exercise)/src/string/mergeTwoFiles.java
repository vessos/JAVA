package string;


import java.io.*;

public class mergeTwoFiles {

    private final static String inPath1 = "/src/resources/index.txt";
    private final static String inPath2 = "/src/resources/index1.txt";
    private final static String output = "/src/resources/output.txt";

    public static void main(String[] args) {

        final String generalPath = System.getProperty("user.dir");

        String input1 = generalPath+inPath1;
        String input2 = generalPath+inPath2;
        String outputPath = generalPath+output;
        String newPath = input1;
        try(BufferedReader reader = new BufferedReader(new FileReader(input1));
            BufferedReader reader1 = new BufferedReader(new FileReader(input2));
            PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {

            String file1 = reader.readLine();
            while(file1!=null){
                writer.println(file1);
                file1 = reader.readLine();
            }
            file1 = reader1.readLine();
            while(file1!=null){
                writer.println(file1);
                file1= reader1.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
