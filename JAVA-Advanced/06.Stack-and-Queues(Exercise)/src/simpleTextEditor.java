import java.util.ArrayDeque;
import java.util.Scanner;

public class simpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stackText = new ArrayDeque<>();

        String text="";
        stackText.push(text);

        for (int i = 0; i < N; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            int command = Integer.parseInt(commandLine[0]);
            if (command == 1) {

                text+=(commandLine[1]);
                stackText.push(text);

            } else if (command == 2) {

                int eraser = Integer.parseInt(commandLine[1]);
                text=text.substring(0,text.length()-eraser);
                stackText.push(text);

            } else if (command == 3) {

                int printCharacter = Integer.parseInt(commandLine[1]);
                System.out.println(text.charAt(printCharacter - 1));

            } else if (command == 4&&(!stackText.isEmpty())) {
                    stackText.pop();
                    text=stackText.peek();
            }
        }
    }
}
