
public class Main {
    public static void main(String[] args) {

        String[]arr = {"first","second","third"};
        print();
        print("Pesho");
        print(arr);

    }
    public static void print(String... varargs){
        if(varargs.length==0){
            System.out.println("No arguments");
            return;
        }

        for (String vararg : varargs) {
            System.out.println(vararg);
        }

    }
}
