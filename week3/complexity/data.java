package week3.complexity;

import java.io.*;

public class data {

    public static void readUsingFileReader(String filePath) throws IOException {
        long start = System.nanoTime();
        FileReader reader = new FileReader(filePath);
        while (reader.read() != -1) {}
        reader.close();
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start) / 1_000_000 + " ms");
    }

    public static void readUsingInputStreamReader(String filePath) throws IOException {
        long start = System.nanoTime();
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
        while (reader.read() != -1) {}
        reader.close();
        long end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start) / 1_000_000 + " ms");
    }

    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/vyshn/Downloads/New Text Document.txt/"; // Replace with a real file path

        System.out.println("Reading File: " + filePath);
        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);
    }
}
