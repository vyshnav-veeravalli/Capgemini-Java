package week3.stacks;

import java.util.*;

public class Problem7 {
    public static boolean pair(int[] arr, int target){
        Set<Integer> seen = new HashSet<>();
        for(int num: arr){
            int complement = target - num;
            if(seen.contains(complement)){
                System.out.println("pair was found");
                return true;
            }
            seen.add(num);
        }
        System.out.println("no pair found");
        return false;
    }

    public static void main(String[] args){
        int[] arr = {8, 4, 1, 6};
        int target = 10;

        pair(arr, target);
    }
}
