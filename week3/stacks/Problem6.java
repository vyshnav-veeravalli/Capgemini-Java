package week3.stacks;

import java.util.*;

public class Problem6 {
    public static List<int[]> findSubarray(int[] arr){
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        int currSum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(map.containsKey(currSum)){
                List<Integer> indices = map.get(currSum);
                for(int startIdx : indices){
                    result.add(new int[]{startIdx + 1, i});
                }
            }

            map.putIfAbsent(currSum, new ArrayList<>());
            map.get(currSum).add(i);
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {3, 4, -7, 1, 3, -4, 2, 2};
        List<int[]> subarrays = findSubarray(arr);

        for(int[] sub: subarrays){
            System.out.println("subarray from index "+sub[0]+" to "+sub[1]);
        }
    }
}
