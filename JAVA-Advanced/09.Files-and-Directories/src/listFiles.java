import java.io.File;

public class listFiles {
    public static void main(String[] args) {

        final String stringPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\Files-and-Streams";

        File file = new File(stringPath);

        if(file.isDirectory()){
           File[]files=file.listFiles();
            for (File f : files) {
                if(!f.isDirectory()){
                    System.out.printf("%s: %s%n",f.getName(),f.length());
                }
            }
        }
        file.length();
    }
}
