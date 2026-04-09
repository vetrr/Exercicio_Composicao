package entities;

public class OrderItem {
    Integer quantity;
    Double price;
    Product product;

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
    
    public Double subTotal(){
        return price*quantity;
    }
}
