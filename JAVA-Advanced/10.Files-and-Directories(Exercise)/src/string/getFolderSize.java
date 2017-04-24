package string;


import java.io.File;
import java.util.ArrayDeque;

public class getFolderSize {

    public static void main(String[] args) {
        // Put path to Folder here;
        final String stringPath = "G:\\SoftUni-Programs\\JAVA\\JAVA-Advanced\\09.Files-and-Directories\\Files-and-Streams\\Files-and-Streams";
        File file = new File(stringPath);

        ArrayDeque<File>queue = new ArrayDeque<>();

        queue.offer(file);

            long len = 0;

        while(!queue.isEmpty()){
            File nestedFile = queue.poll();

            File[]isFD = nestedFile.listFiles();
            for (File f : isFD) {
                if(f.isDirectory()){
                    queue.offer(f);
                }else{
                    len+=f.length();
                }

            }
        }

        System.out.println("Folder size: "+len);

    }
}
