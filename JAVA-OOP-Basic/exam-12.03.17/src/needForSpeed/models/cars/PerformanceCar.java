package needForSpeed.models.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerformanceCar extends Car {

    private List<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        super.setHorsepower(horsepower+(horsepower*50)/100);
        super.setSuspension(suspension-(suspension*25)/100);
        this.addOns = new ArrayList<>();

    }


    @Override
    public void addTune(int index, String addOnn) {

        super.setHorsepower(super.getHorsepower()+index);
        super.setSuspension(super.getSuspension()+(index/2));
        this.addOns.add(addOnn);

    }

    public List<String> getAddOns() {
        return Collections.unmodifiableList(this.addOns);
    }


    @Override
    public String toString() {
        
        String printAddOnn = "";
        int count = 1;
        if(addOns.isEmpty()){
            printAddOnn+="None";
        }
        for (String addOn : addOns) {
            if(count==addOns.size()){
                printAddOnn+=addOn;
            }else{
                printAddOnn +=addOn+", ";
            }
            count++;
        }

        String print = String.format("%s %s %d\n%d HP, 100 m/h in %d s\n%d Suspension force, %d Durability\nAdd-ons: %s",
                super.getBrand(),super.getModel(),super.getYearOfProduction(),
                super.getHorsepower(),super.getAcceleration(),super.getSuspension(),super.getDurability(),printAddOnn);
        return print;
    }


}
