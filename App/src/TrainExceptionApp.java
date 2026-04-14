/**
 * InvalidCapacityException - Custom checked exception for railway domain rules.
 */
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

/**
 * PassengerBogie - Domain object with built-in validation.
 */
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        // Fail-Fast Validation
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero. Provided: " + capacity);
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " [Capacity: " + capacity + "]";
    }
}

/**
 * TrainExceptionApp - UC14: Handle Invalid Bogie Capacity (Custom Exception)
 * * @author Dhriti Gupta
 * @version 14.0
 */
public class TrainExceptionApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==========================================\n");

        // 1. Attempt to create a valid bogie
        try {
            System.out.println("Creating a valid bogie...");
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println("SUCCESS: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        System.out.println();

        // 2. Attempt to create an invalid bogie (Zero Capacity)
        try {
            System.out.println("Creating a bogie with zero capacity...");
            PassengerBogie zeroBogie = new PassengerBogie("AC Chair", 0);
            System.out.println("SUCCESS: " + zeroBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("CAUGHT EXPECTED EXCEPTION: " + e.getMessage());
        }

        System.out.println();

        // 3. Attempt to create an invalid bogie (Negative Capacity)
        try {
            System.out.println("Creating a bogie with negative capacity...");
            PassengerBogie negativeBogie = new PassengerBogie("First Class", -10);
            System.out.println("SUCCESS: " + negativeBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("CAUGHT EXPECTED EXCEPTION: " + e.getMessage());
        }

        System.out.println("\nUC14 custom exception handling completed...");
    }
}