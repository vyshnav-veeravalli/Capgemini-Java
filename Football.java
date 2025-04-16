import java.util.Arrays; 
 
public class Football{ 
 
    public static void main(String[] args) { 
        int[] heights = generateRandomHeights(11); 
        System.out.println("Player Heights (in cm): " + 
Arrays.toString(heights)); 
 
        int sum = calculateSum(heights); 
        double mean = calculateMean(sum, heights.length); 
        int shortest = findShortest(heights); 
        int tallest = findTallest(heights); 
 
        System.out.println("Total Height: " + sum + " cm"); 
        System.out.printf("Mean Height: %.2f cm%n", mean); 
        System.out.println("Shortest Height: " + shortest + " cm"); 
        System.out.println("Tallest Height: " + tallest + " cm"); 
    } 
 
    public static int[] generateRandomHeights(int size) { 
        int[] heights = new int[size]; 

 
        for (int i = 0; i < size; i++) { 
            heights[i] = (int) (Math.random() * 101) + 150; 
        } 
        return heights; 
    } 
 
    public static int calculateSum(int[] array) { 
        int sum = 0; 
        for (int value : array) { 
            sum += value; 
        } 
        return sum; 
    } 
 
    public static double calculateMean(int sum, int count) { 
        return (double) sum / count; 
    } 
 
    public static int findShortest(int[] array) { 
        int shortest = array[0]; 
        for (int value : array) { 
            shortest = Math.min(shortest, value); 
        } 
        return shortest; 
    } 
 
    public static int findTallest(int[] array) { 
        int tallest = array[0]; 
        for (int value : array) { 
            tallest = Math.max(tallest, value); 
        } 
        return tallest; 
    } 
} 