package foodStorage;

public class Citizen extends BaseBuyer {

    private String id;
    private String dateOfBirth;

    public Citizen(String name, Integer age,String id,String dateOfBirth) {
        super(name, age);
        this.id= id;
        this.dateOfBirth= dateOfBirth;
    }

    @Override
    public void BuyFood() {
        super.setFood(super.getFood()+10);
    }

}
