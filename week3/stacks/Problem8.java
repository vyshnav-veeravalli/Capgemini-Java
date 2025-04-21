package week3.stacks;

import java.util.*;

public class Problem8 {
    public static int consecutive(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        int longStreak = 0;

        for(int num: nums){
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }

                longStreak = Math.max(longStreak, currentStreak);
            }
        }
        return longStreak;
    }

    public static void main(String[] args){
        int[] arr = {420, 5, 9, 4, 245, 6, 7, 8};
        int result = consecutive(arr);
        System.out.println("consecutive length: " + result);
    }
}
