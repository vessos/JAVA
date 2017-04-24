package carSalesman;

public class Car {

    private final static Integer WEIGHT = -1;
    private final static String COLOR = "n/a";

    private String model;
    private Engine engine;
    private Integer weight;
    private String color;

   public Car(String model,Engine engine,Integer weight,String color){
       this.model = model;
       this.engine = engine;
       this.weight = weight;
       this.color =color;
   }
   public Car(String model,Engine engine){
       this(model,engine,WEIGHT,COLOR);
   }
   public Car(String model , Engine engine,Integer weight){
       this(model,engine,weight,COLOR);
   }
   public Car(String model ,Engine engine,String color){
       this(model,engine,WEIGHT,color);
   }

    private String getModel() {
        return this.model;
    }

    private Engine getEngine() {
        return this.engine;
    }

    private Integer getWeight() {
        return this.weight;
    }

    private String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n  %s%n  Weight: %s%n  Color: %s",this.getModel(),this.getEngine(),this.getStringWeight(),this.getColor());
    }

    private String getStringWeight(){
       if(this.getWeight()==-1){
           return "n/a";
       }else{
           return String.valueOf(this.weight);
       }
    }


}
