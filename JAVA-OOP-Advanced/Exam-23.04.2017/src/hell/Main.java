package hell;

import hell.interfaces.Hero;
import hell.interfaces.Item;
import hell.interfaces.Recipe;
import hell.models.Heroes.Assassin;
import hell.models.Heroes.Barbarian;
import hell.models.Heroes.Wizard;
import hell.models.Items.CommonItem;
import hell.models.Items.RecipeItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        LinkedHashMap<String,Hero>heroes = new LinkedHashMap<>();

        while(!"Quit".equals(line = reader.readLine())){

            String[] input = line.split(" ");
            String command = input[0];

            switch(command){
                case"Hero":
                    Hero hero = null;
                    String type = input[2];
                    if (type.equals("Barbarian")){
                        hero = new Barbarian(input[1]);
                    }else if(type.equals("Assassin")){
                        hero = new Assassin(input[1]);
                    }else{
                        hero = new Wizard(input[1]);
                    }
                    heroes.put(input[1],hero);
                    System.out.println("Created "+ hero.getClass().toString().substring(25) + " - " + hero.getName());
                    break;
                case"Item":
                    Item item = new CommonItem(input[1],Integer.valueOf(3),Integer.valueOf(4),Integer.valueOf(5),Integer.valueOf(6)
                    ,Integer.valueOf(7));
                    for (String s : heroes.keySet()) {
                        if(s.equals(input[2])){
                            heroes.get(s).addItem(item);
                            System.out.println(item + " - "+input[2]);
                        }
                    }
                    break;
                case"Recipe":
                    String name = input[1];
                    String heroName = input[2];
                    RecipeItem recipleItem  = new RecipeItem(name,Integer.valueOf(input[3]),Integer.valueOf(input[4]),
                            Integer.valueOf(input[5]),Integer.valueOf(input[6]),Integer.valueOf(input[7]));
                    System.out.println(recipleItem + " - "+ heroName);
                    for (int i = 8; i <input.length ; i++) {
                        recipleItem.addRequiredItem(input[i]);
                    }
                    for (String s : heroes.keySet()) {
                        if(s.equals(heroName)){
                            heroes.get(heroName).addRecipe(recipleItem);
                        }
                    }
                    break;
                case"Inspect":
                    String heroName1 = input[1];
                    for (String s : input) {
                        if(heroName1.equals(s)){
                            String className = heroes.get(s).getClass().toString().substring(25);
                            System.out.println(String.format("Hero: %s, Class: %s",heroes.get(s).getName(),className));
                            List<Item>it = (List<Item>) heroes.get(s).getItems();
                            System.out.println("Strength: "+ heroes.get(s).getStrength());
                            System.out.println("Agility: "+ heroes.get(s).getAgility());
                            System.out.println("Intelligence: "+ heroes.get(s).getIntelligence());
                            if(it.isEmpty()){
                                System.out.println("Items: None");
                            }else{
                                for (Item item1 : it) {
                                    System.out.println("Items:");
                                    System.out.println(String.format("###Item: %s%n###+%d Strength%n###+%d Agility%n###+%d Intelligence%n###+%d HitPoints%n###+%d Damage",
                                            item1.getName(),item1.getStrengthBonus(),item1.getAgilityBonus(),
                                            item1.getIntelligenceBonus(),item1.getHitPointsBonus(),item1.getDamageBonus()));
                                }
                            }
                        }
                    }

                    break;
            }
        }

        heroes.entrySet().stream()
                .sorted((a,b)->{long num1 = a.getValue().getAgility()+a.getValue().getStrength()+a.getValue().getIntelligence();
                long num2 = b.getValue().getAgility()+b.getValue().getIntelligence()+b.getValue().getStrength();
                return Long.compare(num2,num1);})
                .forEach(x->{int count = 1;
                            String items = "";
                    try {
                        List<Item>list = (List<Item>)x.getValue().getItems();
                        int count1 = 0;
                        for (Item item : list) {
                            if(count1<list.size()-1){
                                items+=item.getName() +", ";
                            }else{
                                items+=item.getName();
                            }
                            count1++;

                        }
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }

                    System.out.printf("%d. %s: %s\n###HitPoints: %d\n###Damage: %d\n###Strength: %d\n###Agility: %d\n###Intelligence: %d\n###Items: %s%n",count,x.getValue().getClass().toString().substring(25),x.getValue().getName(),
                            x.getValue().getHitPoints(),x.getValue().getDamage(),x.getValue().getStrength(),x.getValue().getAgility(),x.getValue().getIntelligence(),items);count++;});
    }
}