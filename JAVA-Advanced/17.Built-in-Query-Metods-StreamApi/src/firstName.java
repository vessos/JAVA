import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class firstName {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> name = Arrays.asList(reader.readLine().split(" "));

        HashSet<Character>chars = new HashSet<>();
        Arrays.stream(reader.readLine().split(" "))
                .map(s->s.toLowerCase().charAt(0))
                .forEach(c->chars.add(c));

        Optional<String>firstName = name.stream()
                .filter(n-> chars.contains(n.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();

        if(firstName.isPresent()){
            System.out.println(firstName.get());
        }else{
            System.out.println("No match");
        }

    }
}
