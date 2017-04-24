package militaryElit;

import java.util.LinkedHashSet;

public class Commando extends SpecialisedSoldier implements ICommando {

    private LinkedHashSet<Mission>missions;

    public Commando(Integer id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new LinkedHashSet<>();
    }

    @Override
    public String toString() {
        String mission = "";
        if(!this.missions.isEmpty()){
            for (Mission mission1 : missions) {
                    mission+=" "+mission1+"\n";
            }
        }
        return (super.toString() + "\nMissions:\n" + mission).trim();
    }

    @Override
    public void addMission(Mission mission) {
        if(mission.isItMission()){
            this.missions.add(mission);
        }

    }





}
