package week3.searching;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class write {
    public static void main(String[] args){
        try{
            String path = "C:/Users/vyshn/Downloads/kotha.txt";
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);

            FileWriter Writer = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(Writer);

            String line;

            while(!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
