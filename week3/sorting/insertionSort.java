package week3.sorting;

public class insertionSort {
    public static void sort(int[] arr){
        int n= arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>arr[j+1]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args){
        int[] arr = {2, 1, 4, 5, 9, 6, 7, 8};
        sort(arr);
        for (int ento : arr){
            System.out.print(ento+" ");
        }
    }
}
