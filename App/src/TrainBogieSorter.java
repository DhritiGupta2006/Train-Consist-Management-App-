import java.util.Arrays;

/**
 * TrainBogieSorter - UC17: Sort Bogie Names Using Arrays.sort()
 * Utilizes Java's built-in utility methods for efficient alphabetical sorting.
 * * @author Dhriti Gupta
 * @version 17.0
 */
public class TrainBogieSorter {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC17 - Sort Bogie Names (Arrays.sort) ");
        System.out.println("==========================================\n");

        // 1. Array of unsorted bogie type names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury",
                "Sleeper" // Testing duplicates
        };

        System.out.println("Consist Before Sorting (Names):");
        System.out.println(Arrays.toString(bogieNames));

        // 2. Built-in Sorting Logic
        // Arrays.sort() uses Natural Ordering (Alphabetical) for String arrays
        Arrays.sort(bogieNames);

        // 3. Display Sorted Results
        System.out.println("\nConsist After Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17: Built-in sorting operation completed.");
    }
}