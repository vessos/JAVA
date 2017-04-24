package mordorPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]foods = reader.readLine().split(" ");
        Gandalf gandalf = new Gandalf();

        for (String food : foods) {
            String name="";
            int point = 0;
            switch(food.toLowerCase()){
                case "cram":
                    name = "cram";
                    point = 2;
                    break;
                case "lembas":
                    name = "Lembas";
                    point = 3;
                    break;
                case "apple":
                    name = "Apple";
                    point = 1;
                    break;
                case "melon":
                    name = "Melon";
                    point = 1;
                    break;
                case "honeycake":
                    name = "HoneyCake";
                    point = 5;
                    break;
                case "mushrooms":
                    name = "Mushrooms";
                    point = -10;
                    break;
                    default:
                        name = "Everything else";
                        point = -1;
                        break;
            }
            Food eatFood = new Food(name,point);
            gandalf.addFood(eatFood);
        }
        int hapinnessPoint = gandalf.getHapinessPoints();
        String moods = "";
       if(hapinnessPoint<-5){
           moods = "Angry";
       }else if(hapinnessPoint>=-5&&hapinnessPoint<0){
           moods = "Sad";
       }else if (hapinnessPoint>=0&&hapinnessPoint<=15){
           moods = "Happy";
       }else{
           moods = "JavaScript";
       }
        System.out.println(hapinnessPoint);
        System.out.println(moods);
    }
}
