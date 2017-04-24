package footballTeamGenerator;



import java.util.HashMap;


public class Team {

    private final static Double RATING = 0.0;
    private final static Double AVERAGE = 0.0;

    private String footballTeamName;
    private HashMap<String,Player>players;
    private Double rating;
    private double teamAverage;

    public Team(String name){
        this.footballTeamName = name;
        this.players = new HashMap<>();
        this.rating = RATING;
        this.teamAverage = AVERAGE;
    }

    @Override
    public String toString() {
        return String.format("%s - %.0f",this.footballTeamName,this.calculateAverage());
    }

    public void addPlayer(Player player){
        players.put(player.getName(),player);
    }

    public void removePlayer(String name){
        if(!players.containsKey(name)){
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.",name,this.footballTeamName));
        }
        players.remove(name);
    }

    private double calculateAverage(){
        double aver = this.teamAverage;
        for (String s : players.keySet()) {

           aver+=players.get(s).getAverage();

        }
        aver = Math.round(aver);
        return  aver;
    }

}
