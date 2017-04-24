package trafficLights2;

public enum TrafficL {
    RED,
    GREEN,
    YELLOW;

    private static TrafficL[] lights = values() ;

    public TrafficL next(){
        TrafficL next = lights[(this.ordinal()+1) % values().length];
        return next;
    }
}
