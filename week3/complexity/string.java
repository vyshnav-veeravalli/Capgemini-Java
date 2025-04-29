package week3.complexity;



public class string {

    public static void testWithString(int operations) {
        long start = System.nanoTime();
        String result = "";
        for (int i = 0; i < operations; i++) {
            result += "a";
        }
        long end = System.nanoTime();
        System.out.println("String Time for " + operations + " operations: " + (end - start) / 1_000_000 + " ms");
    }

    public static void testWithStringBuilder(int operations) {
        long start = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < operations; i++) {
            builder.append("a");
        }
        long end = System.nanoTime();
        System.out.println("StringBuilder Time for " + operations + " operations: " + (end - start) / 1_000_000 + " ms");
    }

    public static void testWithStringBuffer(int operations) {
        long start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < operations; i++) {
            buffer.append("a");
        }
        long end = System.nanoTime();
        System.out.println("StringBuffer Time for " + operations + " operations: " + (end - start) / 1_000_000 + " ms");
    }

    public static void main(String[] args) {
        int[] testSizes = {1_000, 10_000, 1_000_000};

        for (int size : testSizes) {
            System.out.println("\n--- Testing for " + size + " operations ---");
            testWithString(size);
            testWithStringBuilder(size);
            testWithStringBuffer(size);
        }
    }
}
