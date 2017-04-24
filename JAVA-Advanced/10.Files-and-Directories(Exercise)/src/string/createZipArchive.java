package string;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class createZipArchive {

    private final static String input1 = "/src/resources/index.txt";
    private final static String input2 = "/src/resources/index1.txt";
    private final static String input3 = "/src/resources/index2.txt";
    private final static String output = "/src/resources/files.zip";

    public static void main(String[] args) {

        final String generalPath = System.getProperty("user.dir");

        try(FileInputStream fos1 = new FileInputStream(generalPath+input1);
        FileInputStream fos2 = new FileInputStream(generalPath+input2);
        FileInputStream fos3 = new FileInputStream(generalPath+input3);
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(generalPath+output));
        ) {

            zos.putNextEntry(new ZipEntry("index1.txt"));
            int data = fos1.read();
            while(data!=-1){
                zos.write(data);
                data= fos1.read();
            }
            zos.closeEntry();
            zos.putNextEntry(new ZipEntry("index2.txt"));
            int data1 = fos2.read();
            while(data1!=-1){
                zos.write(data1);
                data1= fos2.read();
            }
            zos.closeEntry();
            zos.putNextEntry(new ZipEntry("index3.txt"));
            int data2 = fos3.read();
            while(data2!=-1){
                zos.write(data2);
                data2= fos3.read();
            }
            zos.closeEntry();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
