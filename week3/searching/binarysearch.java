package week3.searching;

public class binarysearch {
    public static void main(String[] args){
        int[] arr = {4, 9, 1, 2, 3};
        int left =0;
        int right = arr.length -1;

        while (left<right){
            int mid = (right - left)/2;
            if(arr[mid]>arr[right]){
                left = mid+1;
            }
            else {
                right = mid;
            }
        }
        System.out.println(arr[left]);
    }
}
