package solution;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 10);
        fruits.put("banana", 5);
        fruits.put("orange", 7);

        MarketSupplying supplier = new MarketSupplying();

        Map<String, Integer> updatedFruits = supplier.supplyFruits(fruits, 5);

        for (Map.Entry<String, Integer> entry : updatedFruits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}