import java.util.ArrayList;
import java.util.List;

/**
 * Bogie Class - Represents a railway carriage with specific properties.
 */
class Bogie {
    private String id;
    private String type;

    public Bogie(String id, String type) {
        this.id = id;
        this.type = type;
    }

    // Getter for the ID
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bogie [ID: " + id + ", Type: " + type + "]";
    }
}

/**
 * TrainBogieManager - UC3: Using Object-Oriented Collections
 * This class handles the logic of managing Bogie objects.
 * * @author Dhriti Gupta
 * @version 3.0
 */
public class TrainBogieManager {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App v3.0 ===");

        // 1. Initialize a List of Objects instead of Strings
        List<Bogie> trainConsist = new ArrayList<>();

        // 2. Add Bogie Objects
        System.out.println("\n--- Step 1: Attaching Bogie Objects ---");
        trainConsist.add(new Bogie("S-101", "Sleeper"));
        trainConsist.add(new Bogie("A-201", "AC Chair"));
        trainConsist.add(new Bogie("G-501", "Goods"));

        for (Bogie b : trainConsist) {
            System.out.println("Attached: " + b);
        }

        // 3. Search for a specific Bogie ID
        String searchId = "A-201";
        System.out.println("\n--- Step 2: Searching for Bogie ID: " + searchId + " ---");
        boolean found = false;
        for (Bogie b : trainConsist) {
            if (b.getId().equals(searchId)) {
                System.out.println("Status: Bogie " + searchId + " found in the consist.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Status: Bogie not found.");

        System.out.println("\nObject-oriented management successful.");
    }
}