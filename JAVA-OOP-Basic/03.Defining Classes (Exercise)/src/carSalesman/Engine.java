package carSalesman;


public class Engine {

    private final static Integer DISPLACEMENT = -1;
    private final static String EFFICIENCY = "n/a";

    private String model;
    private Integer power;
    private Integer displacement;
    private String efficiency;

    public Engine(){

    }

    public Engine(String model,Integer power,Integer displacement,String efficiency){

        this.model = model;
        this.power=power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
    public Engine(String model,Integer power,Integer displacement){
        this(model,power,displacement,EFFICIENCY);
    }
    public Engine(String model,Integer power){
        this(model,power,DISPLACEMENT,EFFICIENCY);
    }
    public Engine (String model,Integer power,String efficiency){
        this(model,power,DISPLACEMENT,efficiency);
    }

   private String getModel() {
        return this.model;
    }

    private Integer getPower() {
        return this.power;
    }
    private Integer getDisplacement(){
        return this.displacement;
    }


    private String getEfficiency() {
        return this.efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s:%n    Power: %d%n    Displacement: %s%n    Efficiency: %s",this.getModel(),this.getPower(),this.getStringDisplacement(),this.getEfficiency());
    }

    public String getStringDisplacement() {
        if(getDisplacement()==-1){
            return "n/a";
        }else{
            return String.valueOf(getDisplacement());
        }

    }
}
