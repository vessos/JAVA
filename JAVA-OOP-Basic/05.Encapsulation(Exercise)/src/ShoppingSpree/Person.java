package ShoppingSpree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<String> bagOfProducts;

    public Person (String name,String money){
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name){
        if(name.trim().isEmpty()||name==null){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        return this.money;
    }

    private void setMoney(String money) {
        double monney = Double.parseDouble(money);
        if(monney<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = monney;
    }

    private void addProducts(String product){
        this.bagOfProducts.add(product);
    }

    public List<String> getBagOfProducts() {
        if(this.bagOfProducts.isEmpty()){
            throw new IllegalArgumentException("Nothing bought");
        }
        return Collections.unmodifiableList(this.bagOfProducts);
    }


    public void buyProduct (String product,double price){
        double priceOfProducts = price;
        if(this.getMoney()-priceOfProducts<0){
            throw new IllegalArgumentException(this.getName() + " can't afford " + product);
        }
        this.money = this.money-priceOfProducts;
        addProducts(product);
        System.out.println(this.getName() + " bought " + product);
    }


}

