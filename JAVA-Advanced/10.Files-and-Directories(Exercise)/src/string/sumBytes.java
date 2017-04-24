package string;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sumBytes {
    private final static String path = "/src/resources/index.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String projectpath = System.getProperty("user.dir");
        String inputPath = projectpath + path;

        FileReader fr = new FileReader(inputPath);

        try(BufferedReader reader  = new BufferedReader(fr) ) {

            String line = reader.readLine();
            long sum = 0;

            while(line!=null){
                for (char c : line.toCharArray()) {
                    sum+=c;
                }
                line = reader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
