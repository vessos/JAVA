package pokemonTrainer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();
        try {
            while (!"Tournament".equals(line = reader.readLine())) {

                String[] input = line.split("[\\s\\t\\n]+");
                String trainersName = input[0];
                String pokemonName = input[1];
                String pokemonElement = input[2];
                Integer pokemonHealth = Integer.valueOf(input[3]);

                Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
                Trainer trainer = new Trainer(trainersName);

                if (!trainers.containsKey(trainersName)) {
                    trainers.put(trainersName, trainer);
                }
                trainers.get(trainersName).setPokemons(pokemon);

            }
            while (!"End".equals(line = reader.readLine())) {

                String battle = line;
                for (String s : trainers.keySet()) {
                    trainers.get(s).battlePokemon(battle);
                    trainers.get(s).removeDeadPokemons();
                }
            }

            trainers.entrySet().stream()
                    .sorted((a, b) -> Integer.compare(b.getValue().getNumberOfBadges(), a.getValue().getNumberOfBadges()))
                    .forEach(x -> System.out.println(x.getValue().getName() +
                            " " + x.getValue().getNumberOfBadges() +
                            " " + x.getValue().getPokemons().size()));
        }catch(IndexOutOfBoundsException iabe){
            System.out.println("");
        }

    }
}
