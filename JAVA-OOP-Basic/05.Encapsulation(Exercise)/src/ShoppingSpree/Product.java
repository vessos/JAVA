package ShoppingSpree;


public class Product {

    private String name;
    private double cost;

    public Product(String name,String cost){
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {

        return this.name;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    private void setCost(String cost) {
        double costt = Double.parseDouble(cost);
        if(costt<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = costt;
    }
}
