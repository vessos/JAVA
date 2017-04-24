package string;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyaPicture {

    private final static String input = "/src/resources/Goo.jpg";
    private final static String output = "/src/resources/picture-copy.jpg";

    public static void main(String[] args) {

        final String generalPath = System.getProperty("user.dir");

        final String inputPath = generalPath+input;
        final String outputPath = generalPath+output;

        try(FileInputStream fis = new FileInputStream(inputPath);
            FileOutputStream fos = new FileOutputStream(outputPath)) {

        int buffer = fis.read();

        while(buffer>=0){
            fos.write(buffer);
            buffer=fis.read();
        }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
