/**
 * CargoSafetyException - Custom Runtime Exception for unsafe cargo operations.
 * Extending RuntimeException makes it an unchecked exception.
 */
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

/**
 * GoodsBogie - Represents a goods carrier with dynamic cargo assignment logic.
 */
class GoodsBogie {
    String shape;
    String cargo = "Empty";

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    /**
     * Assigns cargo while enforcing dynamic safety rules.
     * Rule: Petroleum cannot be assigned to Rectangular bogies.
     */
    public void assignCargo(String newCargo) {
        System.out.println(">>> Attempting to assign [" + newCargo + "] to " + shape + " bogie...");

        try {
            if (shape.equalsIgnoreCase("Rectangular") && newCargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("CRITICAL SAFETY VIOLATION: Rectangular bogies cannot carry Petroleum!");
            }
            this.cargo = newCargo;
            System.out.println("SUCCESS: Cargo assigned successfully.");

        } catch (CargoSafetyException e) {
            System.out.println("CAUGHT EXCEPTION: " + e.getMessage());
            System.out.println("ACTION: Cargo assignment aborted to prevent hazards.");

        } finally {
            // This block executes regardless of whether an exception occurred
            System.out.println("[AUDIT LOG] Safety check completed for Bogie (" + shape + ").");
        }
    }

    @Override
    public String toString() {
        return shape + " Bogie -> Current Cargo: " + cargo;
    }
}

/**
 * TrainCargoSafetyApp - UC15: Safe Cargo Assignment Using try-catch-finally
 * * @author Dhriti Gupta
 * @version 15.0
 */
public class TrainCargoSafetyApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC15 - Safe Cargo Assignment (try-catch) ");
        System.out.println("==========================================\n");

        // 1. Valid Assignment: Cylindrical + Petroleum
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");
        System.out.println("Bogie Status: " + cylindrical + "\n");

        // 2. Invalid Assignment: Rectangular + Petroleum
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum");
        System.out.println("Bogie Status: " + rectangular + "\n");

        // 3. Valid Assignment: Rectangular + Coal
        rectangular.assignCargo("Coal");
        System.out.println("Bogie Status: " + rectangular + "\n");

        System.out.println("UC15 cargo safety handling completed safely.");
    }
}