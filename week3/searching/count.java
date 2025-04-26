package week3.searching;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;


public class count {
    public static void main(String[] args){
        try{
            String path = "C:/Users/vyshn/Downloads/New Text Document.txt";
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            String target = "naa";
            int count = 0;
            while((line = br.readLine()) != null){
                String[] arr= line.split("\\W+");
                for(String a: arr){
                    if(a.equals(target)){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
