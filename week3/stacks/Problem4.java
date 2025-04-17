package week3.stacks;
import java.util.*;

public class Problem4 {
    public static List<Integer> slide(int[] nums, int k){
        List<Integer> result =  new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0; i<nums.length; i++){
            if(!deque.isEmpty() && deque.peekFirst()<= i-k){
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);

            if(i>= k- 1){
                result.add(nums[deque.peekFirst()]);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, -1, 4, 5, 5, -8, 9};
        int k = 3;
        List<Integer> max = slide(arr, k);
        System.out.println("max numbers: ");
        for(int val: max){
            System.out.println(val+" ");
        }
    }
}
