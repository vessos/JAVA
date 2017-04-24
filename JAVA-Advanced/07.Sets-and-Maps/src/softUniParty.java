import java.util.*;

public class softUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String>numbers=new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        HashSet<String>quest = new HashSet<>();
        TreeSet<String>vip = new TreeSet<>();

        while (true){
            String input = scanner.nextLine();
            if("PARTY".equals(input)){
                break;
            }
            if(numbers.contains(input.charAt(0))){
                vip.add(input);
            }else{
                quest.add(input);
            }
        }

        while(true){
            String questsCome = scanner.nextLine();
            if("END".equals(questsCome)){
                break;
            }
            if(numbers.contains(questsCome.charAt(0))){
                vip.remove(questsCome);
            }else{
                quest.remove(questsCome);
            }
        }

        vip.addAll(quest);
        System.out.println(vip.size());
        for (String s : vip) {
            System.out.println(s);
        }
    }

}
