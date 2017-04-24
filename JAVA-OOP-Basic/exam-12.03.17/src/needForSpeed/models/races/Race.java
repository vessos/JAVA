package needForSpeed.models.races;

import needForSpeed.models.cars.Car;

import java.util.HashMap;


public abstract class Race {

    private int length;
    private String route;
    private int prizePool;
    private HashMap<Integer,Car> participants;

    protected Race(int length, String route, int prizePool) {
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
        this.participants= new HashMap<>();
    }

    public String getRoute() {
        return this.route;
    }

    public int getLength() {
        return this.length;
    }

    public double getPrizePool(int count) {
        double prize = 0;
        switch(count){
            case 1:
                prize = (this.prizePool*50)/100;
                break;
            case 2:
                prize = (this.prizePool*30)/100;
                break;
            case 3:
                prize = (this.prizePool*20)/100;
                break;
        }
        return prize;
    }

    public void addParticipants(int id, Car car){
        this.participants.put(id,car);
    }

    public HashMap<Integer,Car> getParticipants() {
        return this.participants;
    }


}
