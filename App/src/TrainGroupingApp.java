import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * TrainGroupingApp - UC9: Group Bogies by Type (Collectors.groupingBy)
 * Categorizes bogies into a Map structure for structured reporting.
 * * @author Dhriti Gupta
 * @version 9.0
 */
public class TrainGroupingApp {

    static class Bogie {
        String type;
        String id;

        Bogie(String type, String id) {
            this.type = type;
            this.id = id;
        }

        @Override
        public String toString() {
            return "[" + id + "]";
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC9 - Group Bogies by Type (groupingBy) ");
        System.out.println("==========================================\n");

        // 1. Initialize a flat list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "S1"));
        bogies.add(new Bogie("Sleeper", "S2"));
        bogies.add(new Bogie("AC Chair", "C1"));
        bogies.add(new Bogie("First Class", "F1"));
        bogies.add(new Bogie("AC Chair", "C2"));

        System.out.println("Original Flat List of Bogies:");
        bogies.forEach(b -> System.out.println(b.type + " " + b.id));

        // 2. Stream Pipeline: Group by type
        // Key: Bogie Type (String), Value: List of Bogie objects
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // 3. Display Grouped Results
        System.out.println("\n--- Grouped Bogie Report ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " Bogies: " + list);
        });

        System.out.println("\nUC9 grouping operations completed...");
    }
}