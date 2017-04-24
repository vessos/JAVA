package dependencyInjection;

public class Elephant extends Animal implements TypeAnimal{

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return String.format(super.getName() + " is " + super.getAge() + "grass");
    }
}
