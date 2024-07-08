package order;

import java.util.ArrayList;
import java.util.List;

public class SaveOrderToDatabase {
    
    private List<Order> database = new ArrayList<>();

    public void saveToDatabase(Order order) {
        
        System.out.println("Saving order to database...");
        database.add(order);
        System.out.println("Order saved to database successfully.");
    }

    public List<Order> getAllOrders() {
        return database;
    }
}
