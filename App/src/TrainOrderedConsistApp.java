import java.util.LinkedList;

/**
 * TrainOrderedConsistApp - UC4: Maintain Ordered Bogie Consist (LinkedList)
 * Models the physical chaining of bogies for ordered operations.
 * * @author Dhriti Gupta
 * @version 4.0
 */
public class TrainOrderedConsistApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================\n");

        // 1. Initialize LinkedList (Maintains insertion order & efficient inserts)
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Step 1: Sequential Addition
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // 3. Step 2: Positional Insertion (Pantry Car at position 2)
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        trainConsist.add(2, "Pantry Car");
        System.out.println(trainConsist);

        // 4. Step 3: Removing Head and Tail Bogies
        System.out.println("\nAfter Removing First and Last Bogie:");
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}