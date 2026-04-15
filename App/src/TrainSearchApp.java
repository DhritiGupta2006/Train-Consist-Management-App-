/**
 * TrainSearchApp - UC18: Linear Search for Bogie ID
 * Implements a sequential search algorithm to locate specific bogies in a consist.
 * * @author Dhriti Gupta
 * @version 18.0
 */
public class TrainSearchApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("==========================================\n");

        // 1. Array of Bogie IDs (Unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 2. Define search keys for testing
        String[] searchKeys = {"BG309", "BG999", "BG101"};

        for (String key : searchKeys) {
            System.out.println("Searching for Bogie ID: " + key);
            boolean found = performLinearSearch(bogieIds, key);

            if (found) {
                System.out.println("RESULT: Bogie " + key + " located in the consist.\n");
            } else {
                System.out.println("RESULT: Bogie " + key + " NOT found.\n");
            }
        }

        System.out.println("UC18 linear search operation completed.");
    }

    /**
     * Performs a Linear Search on a String array.
     * @param arr The array to search through.
     * @param target The ID to look for.
     * @return true if found, false otherwise.
     */
    public static boolean performLinearSearch(String[] arr, String target) {
        // Sequential Traversal
        for (int i = 0; i < arr.length; i++) {
            // Equality Comparison using equals() for Strings
            if (arr[i].equals(target)) {
                // Early Termination: Stop as soon as a match is found
                System.out.println("DEBUG: Match found at index " + i);
                return true;
            }
        }
        return false;
    }
}