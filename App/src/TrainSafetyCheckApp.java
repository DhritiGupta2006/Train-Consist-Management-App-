import java.util.ArrayList;
import java.util.List;

/**
 * TrainSafetyCheckApp - UC12: Safety Compliance Check for Goods Bogies
 * Enforces domain safety rules using Stream.allMatch() and lambda logic.
 * * @author Dhriti Gupta
 * @version 12.0
 */
public class TrainSafetyCheckApp {

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape, String cargo) {
            this.shape = shape;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return shape + " Bogie carrying " + cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("==========================================\n");

        // 1. Prepare a list of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Rectangular", "Grain"));

        // Uncomment the line below to test a safety violation
        // goodsConsist.add(new GoodsBogie("Cylindrical", "Coal")); 

        System.out.println("Inspecting Goods Consist:");
        goodsConsist.forEach(System.out::println);

        // 2. Stream Validation Logic
        // allMatch returns true ONLY if every element satisfies the predicate
        // Business Rule: If shape is Cylindrical, cargo MUST be Petroleum.
        boolean isSafe = goodsConsist.stream().allMatch(b -> {
            if (b.shape.equalsIgnoreCase("Cylindrical")) {
                return b.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are safe by default in this rule
        });

        // 3. Display Safety Result
        System.out.println("\n------------------------------------------");
        if (isSafe) {
            System.out.println(" STATUS: SUCCESS");
            System.out.println(" RESULT: Train is Safety Compliant.");
        } else {
            System.out.println(" STATUS: FAILED");
            System.out.println(" RESULT: Safety Violation Detected! Invalid Cargo Assignment.");
        }
        System.out.println("------------------------------------------");

        System.out.println("\nUC12 safety validation completed...");
    }
}