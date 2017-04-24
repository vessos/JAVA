package string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class sumLines {
    private final static String path = "/src/resources/index.txt";

    public static void main(String[] args) {

        String projectpath = System.getProperty("user.dir");
        final String inputpath = projectpath + path;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputpath))) {
            String line = reader.readLine();

            while (line != null) {
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum+=c;
                }
                System.out.println(sum);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
