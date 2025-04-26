package week3.searching;

import java.util.HashSet;

public class duplicate {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        String input = "Sailaja lakshmi";
        for(char c: input.toCharArray()){
            if(!hs.contains(c)){
                hs.add(c);
                str.append(c);
            }
        }
        System.out.print(str);
    }
}
