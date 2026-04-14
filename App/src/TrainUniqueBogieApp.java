import java.util.HashSet;
import java.util.Set;

/**
 * TrainUniqueBogieApp - UC3: Track Unique Bogie IDs (Set - HashSet)
 * Demonstrates uniqueness enforcement to prevent duplicate registration.
 * * @author Dhriti Gupta
 * @version 3.0
 */
public class TrainUniqueBogieApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App v3.0 ===");

        // 1. Initialize HashSet for Unique Bogie IDs
        Set<String> uniqueBogieIds = new HashSet<>();

        // 2. Add Bogie IDs (Including Duplicates)
        System.out.println("\n--- Step 1: Registering Bogie IDs ---");
        uniqueBogieIds.add("BG101");
        uniqueBogieIds.add("BG102");
        uniqueBogieIds.add("BG103");

        // Intentionally adding a duplicate ID
        System.out.println("Attempting to add duplicate ID: BG101...");
        boolean isAdded = uniqueBogieIds.add("BG101");

        // 3. Display Result of Duplication Check
        if (!isAdded) {
            System.out.println("Warning: Duplicate ID 'BG101' rejected by the system.");
        }

        // 4. Final Summary of Unique IDs
        System.out.println("\n--- Final Unique Bogie Inventory ---");
        System.out.println("Verified Bogie IDs: " + uniqueBogieIds);
        System.out.println("Total Unique Count: " + uniqueBogieIds.size());

        System.out.println("\nUniqueness enforcement successful. No data corruption detected.");
    }
}