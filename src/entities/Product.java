package entities;

public class Product {
    String name;
    Double price;
    
    public Product(){
    }

    public Product(String productName, Double productPrice){
        this.name = productName;
        this.price = productPrice;
    }

    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
}
