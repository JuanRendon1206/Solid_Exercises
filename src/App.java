import java.util.Arrays;
import java.util.List;

import order.CalculateTotalPrice;
import order.Order;
import order.OrderPrinter;
import order.SaveOrderToDatabase;

public class App {

    //ORDER, EXERCISE 1
    public static void main(String[] args) {
        CalculateTotalPrice totalCalculator = new CalculateTotalPrice();

        //Orden falsa:
        Order order = new Order(
            Arrays.asList("Item1", "Item2", "Item3"),
            Arrays.asList(10.0, 20.0, 30.0),
            totalCalculator
        );
        
        OrderPrinter orderPrinter = new OrderPrinter();
        orderPrinter.printOrder(order);

        SaveOrderToDatabase orderRepository = new SaveOrderToDatabase();
        orderRepository.saveToDatabase(order);

        List<Order> allOrders = orderRepository.getAllOrders();
        System.out.println("All Orders in Database:");
        for (Order savedOrder : allOrders) {
            orderPrinter.printOrder(savedOrder);
        }
    }
}
