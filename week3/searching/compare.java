package week3.searching;

import java.io.*;

public class compare {

    public static void main(String[] args) {
        // Part 1: StringBuilder and StringBuffer concatenation
        System.out.println("---- String Concatenation ----");
        concatenateUsingStringBuilder();
        concatenateUsingStringBuffer();

        // Part 2: Reading file and counting words
        System.out.println("\n---- File Reading ----");
        String filePath = "C:/Users/vyshn/Downloads/JAVA/week3/searching/naa.txt";  // Change this to your large file path
        countWordsUsingFileReader(filePath);
        countWordsUsingInputStreamReader(filePath);
    }

    // Using StringBuilder
    public static void concatenateUsingStringBuilder() {
        String[] words = {"Hello", "World", "Java", "Programming"};
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            for (String word : words) {
                sb.append(word);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder concatenation completed.");
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");
    }

    // Using StringBuffer
    public static void concatenateUsingStringBuffer() {
        String[] words = {"Hello", "World", "Java", "Programming"};
        StringBuffer sb = new StringBuffer();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            for (String word : words) {
                sb.append(word);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer concatenation completed.");
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ms");
    }

    // Count words using FileReader
    public static void countWordsUsingFileReader(String filePath) {
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            int wordCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Word count using FileReader: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Count words using InputStreamReader
    public static void countWordsUsingInputStreamReader(String filePath) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader br = new BufferedReader(isr)) {

            int wordCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Word count using InputStreamReader: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

