package week3.complexity;

import java.util.Random;

public class sort {

    public static void swapNumbers(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void arrangeUsingBubble(int[] numbers) {
        int size = numbers.length;
        for (int round = 0; round < size - 1; round++) {
            for (int current = 0; current < size - round - 1; current++) {
                if (numbers[current] > numbers[current + 1]) {
                    swapNumbers(numbers, current, current + 1);
                }
            }
        }
    }

    public static void arrangeUsingMerge(int[] numbers, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            arrangeUsingMerge(numbers, left, middle);
            arrangeUsingMerge(numbers, middle + 1, right);
            joinTogether(numbers, left, middle, right);
        }
    }

    public static void joinTogether(int[] numbers, int left, int middle, int right) {
        int firstSize = middle - left + 1;
        int secondSize = right - middle;
        int[] firstPart = new int[firstSize];
        int[] secondPart = new int[secondSize];
        for (int i = 0; i < firstSize; i++) {
            firstPart[i] = numbers[left + i];
        }
        for (int j = 0; j < secondSize; j++) {
            secondPart[j] = numbers[middle + 1 + j];
        }
        int first = 0, second = 0, merged = left;
        while (first < firstSize && second < secondSize) {
            if (firstPart[first] <= secondPart[second]) {
                numbers[merged++] = firstPart[first++];
            } else {
                numbers[merged++] = secondPart[second++];
            }
        }
        while (first < firstSize) {
            numbers[merged++] = firstPart[first++];
        }
        while (second < secondSize) {
            numbers[merged++] = secondPart[second++];
        }
    }

    public static void arrangeUsingQuick(int[] numbers, int low, int high) {
        if (low < high) {
            int point = putInRightPlace(numbers, low, high);
            arrangeUsingQuick(numbers, low, point - 1);
            arrangeUsingQuick(numbers, point + 1, high);
        }
    }

    public static int putInRightPlace(int[] numbers, int low, int high) {
        int divider = numbers[high];
        int smaller = low - 1;
        for (int walker = low; walker < high; walker++) {
            if (numbers[walker] < divider) {
                smaller++;
                swapNumbers(numbers, smaller, walker);
            }
        }
        swapNumbers(numbers, smaller + 1, high);
        return smaller + 1;
    }

    public static int[] makeRandomNumbers(int count) {
        Random maker = new Random();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = maker.nextInt(count * 2);
        }
        return numbers;
    }

    public static void measureSortTimes(int count) {
        int[] numbersForBubble = makeRandomNumbers(count);
        int[] numbersForMerge = numbersForBubble.clone();
        int[] numbersForQuick = numbersForBubble.clone();

        long startBubble = System.nanoTime();
        arrangeUsingBubble(numbersForBubble);
        long endBubble = System.nanoTime();
        long timeBubble = (endBubble - startBubble) / 1_000_000;

        long startMerge = System.nanoTime();
        arrangeUsingMerge(numbersForMerge, 0, numbersForMerge.length - 1);
        long endMerge = System.nanoTime();
        long timeMerge = (endMerge - startMerge) / 1_000_000;

        long startQuick = System.nanoTime();
        arrangeUsingQuick(numbersForQuick, 0, numbersForQuick.length - 1);
        long endQuick = System.nanoTime();
        long timeQuick = (endQuick - startQuick) / 1_000_000;

        System.out.println("Numbers Count: " + count);
        System.out.println("Bubble Sort Time: " + timeBubble + " ms");
        System.out.println("Merge Sort Time: " + timeMerge + " ms");
        System.out.println("Quick Sort Time: " + timeQuick + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Bubble vs Merge vs Quick Sort Comparison\n");

        measureSortTimes(1000);
        measureSortTimes(10_000);
        measureSortTimes(1_000_000);
    }
}
