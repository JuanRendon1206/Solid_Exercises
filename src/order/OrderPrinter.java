package order;

import java.util.List;

public class OrderPrinter {

    public void printOrder(Order order){
        System.out.println("Order Items:");

        List<String> items = order.getItems();
        List<Double> prices = order.getPrices();

        for(int i = 0; i < items.size(); i++){
            System.out.println("Item: " + items.get(i) + " - price: " + prices.get(i));
        }
        
        System.out.println("Total amount: $" + order.getTotalAmount());
    }   
}
