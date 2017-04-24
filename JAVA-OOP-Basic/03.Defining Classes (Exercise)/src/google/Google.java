package google;

import java.util.ArrayList;
import java.util.List;

public class Google {

    private String name;
    private Company company;
    private Car car;
    private List<Pokemon>pokemons;
    private List<Parents>parents;
    private List<Children>childrens;


    public Google(String name){
        this.name = name;
        this.car = new Car();
        this.company = new Company();
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.childrens = new ArrayList<>();
    }

    private Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    private Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void addPokemons(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    private List<Parents> getParents() {
        return this.parents;
    }

    public void addParents(Parents parent) {
        this.parents.add(parent);
    }

    private List<Children> getChildrens() {
        return this.childrens;
    }

    public void addChildrens(Children children) {
        this.childrens.add(children);
    }

    private String toStringPokemons(){
        String pok = "";
        for (Pokemon pokemon : this.pokemons) {
            pok+=pokemon;
            pok+="\n";
        }
        return pok;
    }
    private String toStringParents(){
        String pok = "";
        for (Parents parents : this.parents) {
            pok+=parents;
            pok+="\n";
        }
        return pok;
    }

    private String toStringChildrens(){
        String pok = "";
        for (Children child : this.childrens) {
            pok+=child;
            pok+="\n";
        }
        return pok;
    }

    private String toStringCompany(){
        String pok = "";
        if(this.company.getSalary()!=0.00) {
            pok += this.company + "\n";
        }
        return pok;
    }

    private String toStringCar(){
        String pok = "";
        if(this.car.getCarSpeed()!=null) {
            pok += this.car + "\n";
        }
        return pok;
    }

    @Override
    public String toString() {
        return  name + '\n' +
                "Company:" + "\n"+this.toStringCompany()+
                "Car:" +"\n"+this.toStringCar()+
                "Pokemon:" +"\n" +this.toStringPokemons()+
                "Parents:"+ "\n"+ this.toStringParents()+
                "Children:"+"\n" + this.toStringChildrens()
                ;
    }
}
