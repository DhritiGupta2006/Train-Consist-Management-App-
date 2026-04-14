import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TrainStreamFilterApp - UC8: Filter Passenger Bogies Using Streams
 * Uses the Stream API to filter bogies based on seating capacity.
 * * @author Dhriti Gupta
 * @version 8.0
 */
public class TrainStreamFilterApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("==========================================\n");

        // 1. Initialize the Bogie List
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // 2. Stream Pipeline: Filter bogies with capacity > 60
        // stream() -> source
        // filter() -> intermediate operation (predicate)
        // collect() -> terminal operation
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 3. Display Filtered Results
        System.out.println("\n--- Filtered Results (Capacity > 60) ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // 4. Verify Integrity of Original List
        System.out.println("\nVerification: Original list size is still " + bogies.size());

        System.out.println("\nUC8 stream filtering completed...");
    }
}