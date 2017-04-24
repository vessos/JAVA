package militaryElit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        List<Private>army = new ArrayList<>();

        while(!"End".equals(line = reader.readLine())){

            String input[] = line.split(" ");
            String position = input[0];
            Private soldier = null;

            switch (position){
                case"Private":
                    soldier = new Private(Integer.valueOf(input[1]),
                            input[2],input[3],Double.valueOf(input[4]));
                    army.add(soldier);
                    System.out.println(soldier);
                    break;
                case"Spy":
                  Spy  soldier5 = new Spy(Integer.valueOf(input[1]),
                            input[2],input[3],Integer.valueOf(input[4]));

                    System.out.println(soldier5);
                    break;
                case"Engineer":
                     Engineer soldier1 = new Engineer(Integer.valueOf(input[1]),
                            input[2],input[3],Double.valueOf(input[4]),input[5]);
                    if(input.length>6){
                        Repair repair;
                        for (int i = 6; i <input.length ; i+=2) {
                            repair = new Repair(input[i],Integer.valueOf(input[i+1]));
                            soldier1.addRepairPart(repair);
                        }
                    }
                    System.out.println(soldier1);
                    break;
                case"Commando":
                    ICommando soldier2 = new Commando(Integer.valueOf(input[1]),
                            input[2],input[3],Double.valueOf(input[4]),input[5]);
                    if(input.length>6){
                        Mission mission;
                        for (int i = 6; i <input.length ; i+=2) {
                            mission = new Mission(input[i],input[i+1]);
                            soldier2.addMission(mission);
                        }
                    }
                    System.out.println(soldier2);
                    break;
                case"LeutenantGeneral":
                   ILeutenantGeneral soldier3 = new LeutenantGeneral(Integer.valueOf(input[1]),
                            input[2],input[3],Double.valueOf(input[4]));
                    if(input.length>5){
                        for (int i = 5; i < input.length; i++) {
                            int soldierId = Integer.valueOf(input[i]);
                            for (Private iSoldier : army) {
                                if(soldierId==iSoldier.getId()){
                                    soldier3.setSoldiers(iSoldier);
                                }
                            }
                        }
                    }
                    System.out.println(soldier3);
                    break;
            }
        }
    }
}
