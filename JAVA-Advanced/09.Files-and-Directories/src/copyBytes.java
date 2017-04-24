import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyBytes {
    public static void main(String[] args) {
        String inputPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\input.txt";
        String outputPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\output.txt";

        try(FileInputStream fis = new FileInputStream(inputPath);
            FileOutputStream fos = new FileOutputStream(outputPath)) {

            int oneByte = fis.read();
            while(oneByte>=0){
                if(oneByte==' ' || oneByte=='\n'){
                    fos.write(oneByte);
                }else{
                    String decimal =String.valueOf(oneByte);
                    for (char c : decimal.toCharArray()) {
                        fos.write(c);
                    }
                }
                oneByte=fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
