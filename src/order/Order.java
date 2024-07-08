package order;
import java.util.List;

public class Order {
    
    private List<String> items;
    private List<Double> prices;
    private double totalAmount; 

    //Constructor
    public Order(List<String> items, List<Double> prices, CalculateTotalPrice totalCalculator) {
        this.items = items;
        this.prices = prices;
        this.totalAmount = CalculateTotalPrice.calculateTotal(items, prices);
    }

    //Getters and Setters
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Double> getPrices() {
        return prices;
    }

    public void setPrices(List<Double> prices) {
        this.prices = prices;
    }
}