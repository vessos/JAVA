package google;

public class Pokemon {

    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName,String pokemonType){
        this.setPokemonName(pokemonName);
        this.setPokemonType(pokemonType);
    }

    private String getPokemonName() {
        return this.pokemonName;
    }

    private void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    private String getPokemonType() {
        return this.pokemonType;
    }

    private void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.getPokemonName(),this.getPokemonType());
    }
}
