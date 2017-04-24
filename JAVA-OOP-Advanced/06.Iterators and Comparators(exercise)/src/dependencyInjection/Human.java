package dependencyInjection;

public class Human extends Animal implements TypeAnimal{

    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public String getEat() {
        return String.format(super.getName() + " is " + super.getAge() + "meat");
    }
}
