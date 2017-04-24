package needForSpeed.models.cars;


public class ShowCar extends Car {

    private final static int STARS=0;

    private int stars;
    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.stars = STARS;
    }

    @Override
    public void addTune(int index, String addOnn) {
        super.setHorsepower(super.getHorsepower()+index);
        super.setSuspension(super.getSuspension()+(index/2));
        this.stars+=index;
    }

    public int getStars() {
        return this.stars;
    }
    public void addStars(int stars){
        this.stars+=stars;
    }

    @Override
    public String toString() {
        String print = String.format("%s %s %d\n%d HP, 100 m/h in %d s\n%d Suspension force, %d Durability\n%d *",
                super.getBrand(),super.getModel(),super.getYearOfProduction(),
                super.getHorsepower(),super.getAcceleration(),super.getSuspension(),super.getDurability(),this.getStars());
        return print;
    }
}
