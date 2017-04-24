package dependencyInjection;

public class Restaurant {
    TypeAnimal animal;

    public Restaurant() {
        this.animal = null;
    }

    public void setAnimal(TypeAnimal animal) {
        this.animal = animal;
    }

    public void eat(){
        System.out.println(this.animal.getEat() + " eat" );
    }
}
