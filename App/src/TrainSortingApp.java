import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * TrainSortingApp - UC7: Sort Bogies by Capacity (Comparator)
 * This class sorts passenger bogies based on seating capacity using a custom Comparator.
 * * @author Dhriti Gupta
 * @version 7.0
 */
public class TrainSortingApp {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==========================================\n");

        // 1. Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // 2. Add bogie objects to the list
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // 3. Display data before sorting
        System.out.println("Before Sorting:");
        bogies.forEach(System.out::println);

        // 4. Sort using Comparator logic (Ascending Order)
        // Comparing objects based on the 'capacity' field
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 5. Display sorted results
        System.out.println("\nAfter Sorting by Capacity:");
        bogies.forEach(System.out::println);

        System.out.println("\nUC7 sorting completed...");
    }
}