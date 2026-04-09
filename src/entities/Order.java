package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    Date moment;
    OrderStatus status;
    CLient client;

    List <OrderItem> items = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        Double sum =0.0;
        for (OrderItem i : items){
            sum = i.subTotal();
        }
        return sum;
    }
}
