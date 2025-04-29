package week3.complexity;


import java.util.Arrays;
import java.util.Random;

public class searching {

    public static int findUsingLinear(int[] numbers, int target) {
        for (int position = 0; position < numbers.length; position++) {
            if (numbers[position] == target) {
                return position;
            }
        }
        return -1;
    }

    public static int findUsingBinary(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (numbers[middle] == target) {
                return middle;
            } else if (numbers[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static int[] createRandomNumbers(int howMany) {
        Random maker = new Random();
        int[] numbers = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            numbers[i] = maker.nextInt(howMany * 2);
        }
        return numbers;
    }

    public static void checkPerformance(int howMany, int target) {
        int[] numbers = createRandomNumbers(howMany);

        long startLinear = System.nanoTime();
        findUsingLinear(numbers, target);
        long endLinear = System.nanoTime();
        long timeLinear = (endLinear - startLinear) / 1_000_000;

        Arrays.sort(numbers);
        long startBinary = System.nanoTime();
        findUsingBinary(numbers, target);
        long endBinary = System.nanoTime();
        long timeBinary = (endBinary - startBinary) / 1_000_000;

        System.out.println("Numbers Count: " + howMany);
        System.out.println("Linear Search Time: " + timeLinear + " ms");
        System.out.println("Binary Search Time (after sorting): " + timeBinary + " ms");

    }

    public static void main(String[] args) {
        System.out.println("Linear Search vs Binary Search\n");

        checkPerformance(1000, 500);
        checkPerformance(10_000, 5000);
        checkPerformance(1_000_000, 500_000);
    }
}
