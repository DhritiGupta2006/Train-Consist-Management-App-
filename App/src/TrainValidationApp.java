import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TrainValidationApp - UC11: Validate Train ID & Cargo Codes (Regex)
 * Enforces data integrity by validating input formats using Regular Expressions.
 * * @author Dhriti Gupta
 * @version 11.0
 */
public class TrainValidationApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("==========================================\n");

        // 1. Define Regex Patterns
        // TRN-\\d{4} : Starts with 'TRN-', followed by exactly 4 digits.
        // PET-[A-Z]{2}: Starts with 'PET-', followed by exactly 2 uppercase letters.
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile Patterns
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // 3. Test Data (Valid and Invalid)
        String[] testTrainIds = {"TRN-1234", "TRN123", "TRN-12A3", "1234-TRN"};
        String[] testCargoCodes = {"PET-AB", "PET-12", "PET-abc", "PET-XYZ"};

        // 4. Validate Train IDs
        System.out.println("--- Validating Train IDs ---");
        for (String id : testTrainIds) {
            Matcher matcher = trainIdPattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("[VALID]   " + id);
            } else {
                System.out.println("[INVALID] " + id + " (Expected format: TRN-xxxx)");
            }
        }

        // 5. Validate Cargo Codes
        System.out.println("\n--- Validating Cargo Codes ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoCodePattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("[VALID]   " + code);
            } else {
                System.out.println("[INVALID] " + code + " (Expected format: PET-XX)");
            }
        }

        System.out.println("\nUC11 validation logic completed...");
    }
}