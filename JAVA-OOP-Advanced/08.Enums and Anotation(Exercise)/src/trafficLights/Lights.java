package trafficLights;

public enum Lights {
    RED,
    GREEN,
    YELLOW;

    private static Lights[]values = values();

    public Lights next(){
        Lights next = values[(this.ordinal()+1)%values.length];
        return next;
    }
}
