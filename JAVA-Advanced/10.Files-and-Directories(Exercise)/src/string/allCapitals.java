package string;


import java.io.*;

public class allCapitals {
    private final static String pathIn = "/src/resources/index.txt";
    private final static String pathOut = "/src/resources/output.txt";

    public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");

        String inputPath = projectPath + pathIn;
        String outputPath = projectPath + pathOut;
//
//        FileReader fr = new FileReader(inputPath);
//        FileWriter fw = new FileWriter(outputPath);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter outStr = new PrintWriter(new FileWriter(outputPath))) {

            String line = reader.readLine();

            while(line!=null){
                String upp = line.toUpperCase();
                outStr.println(upp);
                line = reader.readLine();
//                outStr.flush();
            }
//            outStr.flush();
//            outStr.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
