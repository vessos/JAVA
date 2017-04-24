package foodStorage;

public class Rebel extends BaseBuyer {

    private String group;

    public Rebel(String name, Integer age,String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public void BuyFood() {
        super.setFood(super.getFood()+5);
    }
}
