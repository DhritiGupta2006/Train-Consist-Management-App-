import java.util.Arrays;

/**
 * TrainConsistSorter - UC16: Sort Passenger Bogies by Capacity (Bubble Sort)
 * Demonstrates manual algorithmic sorting without using built-in library methods.
 * * @author Dhriti Gupta
 * @version 16.3
 */
public class TrainConsistSorter {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC16 - Manual Capacity Sorting (Bubble) ");
        System.out.println("==========================================\n");

        // 1. Array of bogie seat capacities to be sorted
        int[] capacities = {72, 24, 56, 80, 60, 48};

        System.out.println("Original Consist Order: " + Arrays.toString(capacities));

        // 2. Bubble Sort Logic
        // Outer loop: handles the number of passes
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {

            // Optimization: skip remaining passes if no swaps occur
            boolean swapped = false;

            // Inner loop: compares adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If left element is greater than right, swap them
                if (capacities[j] > capacities[j + 1]) {

                    // 3. Swapping Logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }

        // 4. Output results
        System.out.println("Sorted Consist Order:   " + Arrays.toString(capacities));

        System.out.println("\nUC16: Manual sorting via TrainConsistSorter completed.");
    }
}