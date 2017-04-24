import java.util.Scanner;

public class characterMyltiplayer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine().split(" ");
        String str1 = input[0];
        String str2 = input[1];

        int minLenght = Math.min(str1.length(),str2.length());

        int endSum=0;
        if(str1.length()==str2.length()){
           endSum=myltiplyString(str1,str2,minLenght);
        }else{

            if(str1.length()==minLenght){
                endSum=myltiplyString(str1,str2,minLenght);
                for (int i = minLenght; i <str2.length() ; i++) {
                    endSum+=(int)str2.charAt(i);
                }
            }else{
                endSum=myltiplyString(str1,str2,minLenght);
                for (int i = minLenght; i <str1.length() ; i++) {
                    endSum+=(int)str1.charAt(i);
                }
            }
        }

        System.out.println(endSum);

    }
    public static int myltiplyString(String str1,String str2,int minlength){
        int sum =0;
        for (int i = 0; i <minlength ; i++) {
            sum += (int)(str1.charAt(i))*(int)str2.charAt(i);
        }
        return sum;
    }
}
