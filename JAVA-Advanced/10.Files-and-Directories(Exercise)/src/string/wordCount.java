package string;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class wordCount {

    private final static String pathIn = "/src/resources/words.txt";
    private final static String pathIn1 = "/src/resources/text.txt";
    private final static String out = "/src/resources/rezult.txt";

    public static void main(String[] args) {

        final String generalPath = System.getProperty("user.dir");

        final String inputPath1 = generalPath+pathIn;
        final String inputPath2 = generalPath+pathIn1;
        final String outputPath = generalPath+out;

        try(BufferedReader reader = new BufferedReader(new FileReader(inputPath1));
        BufferedReader reader1 = new BufferedReader(new FileReader(inputPath2));
            PrintWriter writer = new PrintWriter(outputPath)) {

            HashMap<String,Integer>keyWords = new HashMap<>();
            HashMap<String,String>originalWords = new HashMap<>();

            String line = reader.readLine();
            while(line!=null){
                String[]words = line.split(" ");

                for (String word : words) {

                    if(!keyWords.containsKey(word)){
                        keyWords.put(word.toLowerCase(),0);
                        originalWords.put(word.toLowerCase(),word);
                    }
                }
                line = reader.readLine();
            }

            String line1 = reader1.readLine();
            while(line1!=null){
                String[]words = line1.toLowerCase().split(" ");

                for (String word : words) {

                    if(keyWords.containsKey(word)){
                        keyWords.put(word,keyWords.get(word)+1);
                    }
                }

                line1 = reader1.readLine();
            }

           keyWords.entrySet().stream().sorted((e1,e2)->e2.getValue()
                   .compareTo(e1.getValue()))
                   .forEach(pair-> writer.printf("%s - %d%n",originalWords.get(pair.getKey()),pair.getValue()));
            System.out.println(keyWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
