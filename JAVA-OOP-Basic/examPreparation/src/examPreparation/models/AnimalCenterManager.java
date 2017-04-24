package examPreparation.models;


import examPreparation.models.animals.Animal;
import examPreparation.models.animals.Cat;
import examPreparation.models.animals.Dog;
import examPreparation.models.centers.AdoptionCenter;
import examPreparation.models.centers.Center;
import examPreparation.models.centers.CleansingCenter;

import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalCenterManager {

    private HashMap<String, AdoptionCenter> adopitionCenters;
    private HashMap<String, CleansingCenter> cleansingCenters;
    private List<Animal> cleansedAnimals;
    private List<Animal> adoptedAnimals;

    public AnimalCenterManager() {
        this.adopitionCenters = new HashMap<>();
        this.cleansingCenters = new HashMap<>();
        this.cleansedAnimals = new ArrayList<>();
        this.adoptedAnimals = new ArrayList<>();
    }

    public void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        this.cleansingCenters.put(name, cleansingCenter);
    }

    public void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        this.adopitionCenters.put(name, adoptionCenter);
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        Animal dog = new Dog(name, age, adoptionCenterName, learnedCommands);
        this.adopitionCenters.get(adoptionCenterName).register(dog);

    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        Animal cat = new Cat(name, age, adoptionCenterName, intelligenceCoefficient);
        this.adopitionCenters.get(adoptionCenterName).register(cat);
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        CleansingCenter cleansingCenter = this.cleansingCenters.get(cleansingCenterName);
        this.adopitionCenters.get(adoptionCenterName).sendForCleansing(cleansingCenter);
    }

    public void cleanse(String cleansingCenterName) {
        List<Animal> cleansedAnimal = this.cleansingCenters.get(cleansingCenterName).cleanse();

        for (Animal cleanseAnimal : cleansedAnimal) {
            this.adopitionCenters.get(cleanseAnimal.getCenterName()).register(cleanseAnimal);
        }
        this.cleansedAnimals.addAll(cleansedAnimal);
    }

    public void adopt(String adoptionCenterName) {
        List<Animal> adoptedAnimal = this.adopitionCenters.get(adoptionCenterName).adopt();

        this.adoptedAnimals.addAll(adoptedAnimal);

    }

    public void printStatistics() {

        StringBuilder builder = new StringBuilder();
        builder.append("Paw Incorporative Regular Statistics\n");
        builder.append(String.format("Adoption Centers: %d\n",this.adopitionCenters.size()));
        builder.append(String.format("Cleansing Centers: %d\n",this.cleansingCenters.size()));
        builder.append(String.format("Adopted Animals: %s\n",getSortedAnimals(this.adoptedAnimals)));
        builder.append(String.format("Cleansed Animals:: %s\n",getSortedAnimals(this.cleansedAnimals)));
        builder.append(String.format("Animals Awaiting Adoption: %d\n",getAwaitingCount()));
        builder.append(String.format("Animals Awaiting Cleansing: %d\n",getAwaitingCleasingCount()));

        System.out.println(builder.toString());
    }

    private int getAwaitingCleasingCount() {

        int count=this.adopitionCenters.values().stream()
                .flatMap(c->c.getAnimals().stream())
                .collect(Collectors.toList())
                .size();
        return count;
    }

    private int getAwaitingCount() {
        int count=this.adopitionCenters.values().stream()
                .flatMap(c->c.getAnimals().stream())
                .filter(a->a.isCleansed())
                .collect(Collectors.toList())
                .size();
        return count;
    }

    private String getSortedAnimals(List<Animal>animals) {
        if(animals.isEmpty()){
            return "None";
        }

        List<String> sorted = animals.stream()
                .map(a -> a.getName())
                .sorted(Collator.getInstance())
                .collect(Collectors.toList());
        String result=String.join(", ",sorted);
        return result;
    }

}
