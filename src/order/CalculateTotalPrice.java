package order;

import java.util.List;

public class CalculateTotalPrice {
    
    public static double calculateTotal(List<String> items, List<Double> prices){
        
        if(items.size() != prices.size()){
            throw new IllegalArgumentException("Items and prices lists must have the same size");
        }

        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += prices.get(i);
        }
        return total;

    }
}
