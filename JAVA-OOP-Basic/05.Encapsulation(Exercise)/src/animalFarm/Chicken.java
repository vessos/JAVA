package animalFarm;


public class Chicken {

   private String name;
   private Integer age;
   private String productPerDay;

    public Chicken(String name,Integer age){
        this.setName(name);
        this.setAge(age);
        CalculateProductPerDay();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if(null==name ||name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    private void setAge(Integer age) {
        if(age<0 || age>=15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public String getProductPerDay(){
        return this.productPerDay;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %s eggs per day.",this.getName(),this.getAge(),this.getProductPerDay());
    }

    private void CalculateProductPerDay(){
        if(this.getAge()<6){
            this.productPerDay = "2";
        }else if(this.getAge()>=6&&this.getAge()<12){
            this.productPerDay = "1";
        }else{
            this.productPerDay = "0.75";
        }
    }
}
