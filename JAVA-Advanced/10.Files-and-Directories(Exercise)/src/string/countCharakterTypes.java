package string;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Collections;

public class countCharakterTypes {

    private final static String pathIn = "/src/resources/index.txt";
    private final static String pathOut = "/src/resources/output.txt";

    public static void main(String[] args) {

        String generalPath = System.getProperty("user.dir");
        final String inputPath = generalPath + pathIn;
        final String outputPath = generalPath + pathOut;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {

            ArrayDeque<Character> vowels = new ArrayDeque<>();
            Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');
            ArrayDeque<Character> punctoation = new ArrayDeque<>();
            Collections.addAll(punctoation, '!', ',', '.', '?');

            String line = reader.readLine();
            int countVowels = 0;
            int countConsonants = 0;
            int countPunctuation = 0;
            while (line != null) {
                for (char c : line.toCharArray()) {
                    if (c != ' ') {
                        if (vowels.contains(c)) {
                            countVowels++;
                        } else if (punctoation.contains(c)) {
                            countPunctuation++;
                        } else {
                            countConsonants++;
                        }
                    }

                }
                line = reader.readLine();
            }

            writer.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", countVowels, countConsonants, countPunctuation);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
