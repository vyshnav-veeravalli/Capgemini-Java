package week3.searching;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class input {
    public static void main(String[] args){
        try{
            String path = "C:/Users/vyshn/Downloads/New Text Document.txt";
            FileInputStream fr = new FileInputStream(path);
            InputStreamReader ir = new InputStreamReader(fr, "UTF-8");

            int character;
            int count =0;
            while((character = ir.read()) != -1){
                System.out.println((char) character);
                count++;
            }
            System.out.println(count);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
