package week3.searching;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;


public class filereader {
    public static void main(String[] args){
        try{
            String path = "C:/Users/vyshn/Downloads/New Text Document.txt";
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
