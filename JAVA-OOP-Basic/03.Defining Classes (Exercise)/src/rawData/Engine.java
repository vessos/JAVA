package rawData;


public class Engine {
    private Integer engineSpeed;
    private Integer engginePower;

    public Engine(Integer engineSpeed,Integer enginePower){
        this.engineSpeed = engineSpeed;
        this.engginePower = enginePower;
    }

    public Integer getEngginePower() {
        return this.engginePower;
    }
}
