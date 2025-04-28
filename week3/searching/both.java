package week3.searching;

import java.util.Arrays;

public class both {

    // Function to find the first missing positive integer
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // First step: mark elements by placing each number at its correct index
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Second step: find the first place where index+1 != value
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positions filled correctly
        return n + 1;
    }

    // Function to perform binary search
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        // Copy original array before sorting for binary search
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        int missing = firstMissingPositive(arr);
        int index = binarySearch(sortedArr, target);

        System.out.println("First missing positive integer: " + missing);
        System.out.println("Index of target " + target + " after sorting: " + index);
    }
}
