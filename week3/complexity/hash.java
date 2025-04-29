package week3.complexity;

import java.util.*;

public class hash {

    public static void testSearchPerformance(int dataSize, int target) {
        // Prepare data
        Integer[] array = new Integer[dataSize];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < dataSize; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Linear Search (Array)
        long startArray = System.nanoTime();
        for (int num : array) {
            if (num == target) break;
        }
        long endArray = System.nanoTime();
        long timeArray = (endArray - startArray) / 1_000_000;

        // HashSet Search
        long startHash = System.nanoTime();
        hashSet.contains(target);
        long endHash = System.nanoTime();
        long timeHash = (endHash - startHash);

        // TreeSet Search
        long startTree = System.nanoTime();
        treeSet.contains(target);
        long endTree = System.nanoTime();
        long timeTree = (endTree - startTree);

        System.out.println("Dataset Size: " + dataSize);
        System.out.println("Array Search Time: " + timeArray + " ms");
        System.out.println("HashSet Search Time: " + timeHash + " µs");
        System.out.println("TreeSet Search Time: " + timeTree + " µs");
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Comparing Array vs HashSet vs TreeSet Search Performance");

        testSearchPerformance(1_000, 999);
        testSearchPerformance(100_000, 99_999);
        testSearchPerformance(1_000_000, 999_999);
    }
}
