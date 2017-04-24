package animals;


public class Cat extends Animals {

    public Cat(String name,int age,String gender){
        super(name,age,gender);
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s",this.getClass().getName().substring(8),super.getName(),super.getAge(),
                super.getGender(),this.produceSound());
    }

    @Override
    protected String produceSound() {
        return "MiauMiau";
    }
}
