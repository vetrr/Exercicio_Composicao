package application;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CLient;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
        System.out.println("Enter client data:");
        System.out.print("Name :");
        String name = sc.nextLine();
        System.out.print("Email :");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date bDay = sdf.parse(sc.next());

        CLient client = new CLient(name, email, bDay);

        System.out.println("Enter order data:");
        System.out.print("Status:");
        String status = sc.next();
        OrderStatus statusOficial = OrderStatus.valueOf(status);
        
        System.out.print("How many items to this order? ");

        Order order = new Order(new Date(), statusOficial, client);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter " + "#" + (i+1) + "item data: ");
            System.out.print("Enter product name: ");
            String productName = sc.next();
            System.out.print("Product price:");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity:");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);

        }
        System.out.println();
        System.out.println("ORDER SUMMUARY:");



        sc.close();
    }
}
