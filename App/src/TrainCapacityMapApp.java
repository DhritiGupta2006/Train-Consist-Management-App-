import java.util.HashMap;
import java.util.Map;

/**
 * TrainCapacityMapApp - UC6: Map Bogie to Capacity (HashMap)
 * Associates each bogie with its seating or load capacity using key-value pairs.
 * * @author Dhriti Gupta
 * @version 6.0
 */
public class TrainCapacityMapApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==========================================\n");

        // 1. Initialize HashMap (Stores data in key -> value format)
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> capacityMap = new HashMap<>();

        // 2. Insert bogie capacities using put() method
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        // 3. Display Bogie Capacity Details
        System.out.println("Bogie Capacity Details:");

        // Iterate through map entries using entrySet()
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}