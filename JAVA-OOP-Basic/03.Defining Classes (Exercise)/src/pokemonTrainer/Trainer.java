package pokemonTrainer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {

    private final static Integer NUMBER_OF_BADGES = 0;

    private String name;
    private Integer numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer() {

    }

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = NUMBER_OF_BADGES;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Pokemon> getPokemons() {
        return Collections.unmodifiableList(this.pokemons);
    }

    public Integer getNumberOfBadges() {
        return this.numberOfBadges;
    }

    public void setPokemons(Pokemon pokemon) {

        this.pokemons.add(pokemon);
    }

    public void battlePokemon(String battle) {
        boolean isItElement = false;
        for (int i = 0; i < this.pokemons.size(); i++) {
            if (this.pokemons.get(i).getElement().equals(battle)) {
                this.numberOfBadges += 1;
                isItElement = true;
                break;
            }
        }
        if (!isItElement) {
            for (int i = 0; i < this.pokemons.size(); i++) {

                this.pokemons.get(i).setHealth(10);

            }
        }
    }

    public void removeDeadPokemons (){
            List<Pokemon>sorted = new ArrayList<>();
            sorted = this.pokemons.stream()
                    .filter(x->x.getHealth()>0)
                    .collect(Collectors.toList());
            this.pokemons = sorted;
    }
}
