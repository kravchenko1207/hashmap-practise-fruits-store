package solution;

import java.util.Map;

public class MarketSupplying {
    public Map<String, Integer> supplyFruits(Map<String, Integer> storage, int supply) {
        //write your code here
        for (Map.Entry<String, Integer> entry : storage.entrySet()) {
            entry.setValue(entry.getValue() + supply);
        }
        return storage;
    }
}