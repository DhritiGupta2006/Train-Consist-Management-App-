import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TrainPerformanceApp - UC13: Performance Comparison (Loops vs Streams)
 * Benchmarks execution time of filtering logic using System.nanoTime().
 * * @author Dhriti Gupta
 * @version 13.0
 */
public class TrainPerformanceApp {

    static class Bogie {
        String id;
        int capacity;

        Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC13 - Performance Comparison ");
        System.out.println("==========================================\n");

        // 1. Prepare a large dataset of bogies (10,000 bogies)
        List<Bogie> largeConsist = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            largeConsist.add(new Bogie("B" + i, (int) (Math.random() * 100)));
        }

        System.out.println("Processing dataset of size: " + largeConsist.size() + " bogies\n");

        // 2. Benchmark Loop-Based Filtering
        long loopStart = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : largeConsist) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        // 3. Benchmark Stream-Based Filtering
        long streamStart = System.nanoTime();
        List<Bogie> streamResult = largeConsist.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        // 4. Display Results
        System.out.println("--- Benchmarking Results ---");
        System.out.println("Loop Duration   : " + loopDuration + " nanoseconds");
        System.out.println("Stream Duration : " + streamDuration + " nanoseconds");

        System.out.println("\n--- Integrity Check ---");
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());
        System.out.println("Results Match      : " + (loopResult.size() == streamResult.size()));

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}