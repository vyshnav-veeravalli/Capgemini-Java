package week3.searching;

public class peak {
    public static void main(String[] args){
        int[] arr = {2, 5, 9, 77, 4, 6, 3, 4, 9, 5 };
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            boolean isLeft = (mid==0 || arr[mid]>arr[mid-1]);
            boolean isRight = (mid == arr.length-1) || (arr[mid]>arr[mid+1]);

            if(isLeft && isRight){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<arr[mid-1]){
                right = mid -1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println(-1);
        return;
    }
}
