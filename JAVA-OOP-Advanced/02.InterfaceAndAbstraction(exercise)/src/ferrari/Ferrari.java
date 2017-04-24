package ferrari;

public class Ferrari implements Car {
    private final static String MODEL = "488-Spider";

    private String model;
    private String driver;

    public Ferrari(String driver){
        this.model = MODEL;
        this.setDriver(driver);
    }

    private void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String useBrackes() {
        return "Brakes!";
    }

    @Override
    public String pushAndTheGasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {

        return String.format("%s/%s/%s/%s",this.model,useBrackes(),pushAndTheGasPedal(),this.driver);
    }
}
