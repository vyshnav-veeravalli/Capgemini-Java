package week3.complexity;


public class fib {

    public static int findFibonacciRecursively(int n) {
        if (n <= 1) return n;
        return findFibonacciRecursively(n - 1) + findFibonacciRecursively(n - 2);
    }

    public static int findFibonacciIteratively(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void measurePerformance(int n) {
        long startRecursive = System.nanoTime();
        findFibonacciRecursively(n);
        long endRecursive = System.nanoTime();
        long timeRecursive = (endRecursive - startRecursive) / 1_000_000; // in ms

        long startIterative = System.nanoTime();
        findFibonacciIteratively(n);
        long endIterative = System.nanoTime();
        long timeIterative = (endIterative - startIterative) / 1_000_000; // in ms

        System.out.println("\nFor Fibonacci(" + n + "):");
        System.out.println("Recursive Time: " + timeRecursive + " ms");
        System.out.println("Iterative Time: " + timeIterative + " ms");
    }

    public static void main(String[] args) {
        System.out.println("Comparing Recursive vs Iterative Fibonacci");

        measurePerformance(10);
        measurePerformance(30);
        measurePerformance(50); // Recursive will be extremely slow or unfeasible for 50
    }
}

