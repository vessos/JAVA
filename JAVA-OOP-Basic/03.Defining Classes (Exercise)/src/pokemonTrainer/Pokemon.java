package pokemonTrainer;


public class Pokemon {

    private String name;
    private String element;
    private Integer health;

    public Pokemon(String name,String element,Integer health){

       this.setName(name);
       this.setElement(element);
       this.health= health;

    }

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return this.element;
    }

    private void setElement(String element) {
        this.element = element;
    }

    public Integer getHealth() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health -= health;
    }
}
