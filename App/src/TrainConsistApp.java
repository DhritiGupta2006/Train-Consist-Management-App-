import java.util.ArrayList;
import java.util.List;

/**
 * TrainConsistApp - UC1: Initializing Train and Displaying Consist Summary
 * This class serves as the entry point for the Train Consist Management System.
 * * @author Dhriti Gupta
 * @version 1.0
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        // 1. Console Output: Print Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Dynamic Initialization: Using List Interface and ArrayList
        // This collection will store bogies dynamically as the train grows.
        List<String> trainConsist = new ArrayList<>();

        // 3. Display Initial Summary
        // Demonstrating the use of .size() to track the collection's state
        System.out.println("Status: Initializing Train...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("\nFoundation laid. Ready to attach bogies.");
    }
}