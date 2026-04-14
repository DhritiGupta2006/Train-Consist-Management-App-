import java.util.LinkedHashSet;
import java.util.Set;

/**
 * TrainFormationApp - UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * Demonstrates how to maintain a sequence while automatically preventing duplicates.
 * * @author Dhriti Gupta
 * @version 5.0
 */
public class TrainFormationApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // 1. Initialize LinkedHashSet
        // It uses a hash table for uniqueness and a linked list for order.
        Set<String> formation = new LinkedHashSet<>();

        // 2. Step 1: Attach bogies in a specific sequence
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // 3. Step 2: Attempt to attach a duplicate bogie
        // The system should ignore this to prevent data corruption.
        System.out.println("Attempting to re-attach 'Sleeper' bogie...");
        formation.add("Sleeper");

        // 4. Final Summary
        System.out.println("\nFinal Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}