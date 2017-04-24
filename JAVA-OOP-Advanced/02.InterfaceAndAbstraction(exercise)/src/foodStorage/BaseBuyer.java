package foodStorage;


public abstract class BaseBuyer implements Buyer {

    private final static Integer FOOD = 0;
    private String name;
    private Integer age;
    private Integer food;

    public BaseBuyer(String name ,Integer age){
        this.name = name;
        this.age= age;
        this.food = FOOD;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Integer getFood() {
        return this.food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    @Override
    public void BuyFood() {

    }
}
