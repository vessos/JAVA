import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class sortLines {
    public static void main(String[] args)  {

        final String inputPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\input.txt";
        final String outputPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\output.txt";

        Path  path = Paths.get(inputPath);
        Path  pathOut = Paths.get(outputPath);

        try {
           List<String> lines = Files.readAllLines(path);
            Collections.sort(lines);
            Files.write(pathOut,lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
