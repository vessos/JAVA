package footballTeamGenerator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        HashMap<String, Team>teams = new HashMap<>();

        while (!"END".equals(line = reader.readLine())){

            String[]input = line.split(";");

            switch(input[0].toLowerCase()){
                case "team":
                    teams.put(input[1],new Team(input[1]));
                    break;
                case "add":
                    if(teams.containsKey(input[1])){
                        try{
                            String name = input[2];
                            Player player = new Player(name,Integer.valueOf(input[3]),Integer.valueOf(input[4])
                                    ,Integer.valueOf(input[5]),Integer.valueOf(input[6]),Integer.valueOf(input[7]));
                            teams.get(input[1]).addPlayer(player);

                        }catch(IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }
                    }else{
                        System.out.println(String.format("Team %s does not exist.",input[1]));
                    }
                    break;
                case "remove":
                    if(teams.containsKey(input[1])){
                        try{
                            String name = input[2];
                            teams.get(input[1]).removePlayer(name);

                        }catch(IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }
                    }else{
                        System.out.println(String.format("Team %s does not exist.",input[1]));
                    }
                    break;
                case "rating":
                    if(teams.containsKey(input[1])){
                        System.out.println(teams.get(input[1]).toString());
                    }else{
                        System.out.println(String.format("Team %s does not exist.",input[1]));
                    }

                    break;
            }
        }
    }
}
