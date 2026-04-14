import java.util.ArrayList;
import java.util.List;

/**
 * TrainCapacityAggregationApp - UC10: Count Total Seats in Train (reduce)
 * Aggregates seating capacities into a single total value using Stream reduction.
 * * @author Dhriti Gupta
 * @version 10.0
 */
public class TrainCapacityAggregationApp {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC10 - Count Total Seats (reduce) ");
        System.out.println("==========================================\n");

        // 1. Initialize the Bogie List
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Current Train Consist:");
        bogies.forEach(System.out::println);

        // 2. Stream Pipeline for Aggregation
        // map() -> Extracts Integer capacity from Bogie object
        // reduce() -> Sums all extracted integers starting from identity 0
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 3. Display the result
        System.out.println("\n------------------------------------------");
        System.out.println(" Total Seating Capacity: " + totalSeats + " seats");
        System.out.println("------------------------------------------");

        System.out.println("\nUC10 capacity aggregation completed...");
    }
}