package ShoppingSpree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split("[=;]+");
        String[]products = reader.readLine().split("[=;]+");
        LinkedHashMap<String,Person> persons = new LinkedHashMap<>();
        LinkedHashMap<String,Product>product = new LinkedHashMap<>();

        try{
            for (int i = 0; i <names.length ; i+=2) {
                String name = names[i];
                String money = names[i+1];
                Person person = new Person(name,money);
                persons.put(person.getName(),person);
            }

            for (int i = 0; i <products.length ; i+=2) {
                String name = products[i];
                String cost = products[i+1];
                Product product1 = new Product(name,cost);
                product.put(product1.getName(),product1);
            }

            String line = "";

            while (!"END".equals(line=reader.readLine())) {

                String[] input = line.split(" ");

                String personName = input[0];
                String productName = input[1];

                if (product.containsKey(productName)) {

                    double price = product.get(productName).getCost();

                    try{
                        if(persons.containsKey(personName)){
                            persons.get(personName).buyProduct(productName,price);
                        }
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }

                }
            }
            for (String s : persons.keySet()) {
                try{
                    System.out.print(s + " - ");
                    List<String> pr = persons.get(s).getBagOfProducts();
                    int count = pr.size();
                    for (String s1 : pr ) {
                        if(count>1){
                            System.out.print(s1 + ", ");
                            count--;
                        }else{
                            System.out.print(s1);
                        }
                    }
                    System.out.println();

                }catch (IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                }

            }
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }


    }
}
