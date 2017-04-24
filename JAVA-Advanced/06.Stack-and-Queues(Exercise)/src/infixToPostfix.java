import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class infixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine().split(" ");



        ArrayDeque<String>symbols = new ArrayDeque<>();


        for (int i = 0; i <input.length ; i++) {

            boolean isNumber = true;
            String element = input[i];
            isNumber=isbool(isNumber,element);

            if(isNumber==false && symbols.isEmpty()){

                symbols.push(element);

            }else if(isNumber==false && (!symbols.isEmpty())){

                String inElement = symbols.peek();

                if(element.equals("^")){

                    symbols.push(element);

                }else if(element.equals("*") && (!inElement.equals("+") && !inElement.equals("-")) ||
                        element.equals("/") && (!inElement.equals("+") && !inElement.equals("-"))){

                    printing(symbols);
                    symbols.push(element);

                }else if(element.equals("+") && (!inElement.equals("(")) ||
                        element.equals("-") && (!inElement.equals("("))) {

                    printing(symbols);
                    symbols.push(element);

                }else if(element.equals(")")){

                    while(!inElement.equals("(")){

                        printing(symbols);
                        inElement=symbols.peek();
                    }
                }
                else{
                    symbols.push(element);
                }
            }else{
                String printElements = element;
                if(!printElements.equals("(")){
                    System.out.print(printElements+" ");
                }

            }
        }
        int count = symbols.size();
        for (int i = 0; i <count ; i++) {
           printing(symbols);
        }


    }
    public static boolean isbool (boolean isnumber,String element){

        ArrayList<String> haveElements = new ArrayList<String>(){{
            add("*");
            add("-");
            add("(");
            add(")");
            add("+");
            add("^");
            add("/");
        }};
        for (String e : haveElements) {
            if(element.equals(e)){
                isnumber=false;
            }
        }
        return isnumber;
    }
    public static void printing(ArrayDeque<String> symbols){
        String pp = symbols.pop();
        if(!pp.equals("(")){
            System.out.print(pp+" ");
        }
    }

}
