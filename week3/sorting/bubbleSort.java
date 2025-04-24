package week3.sorting;

public class bubbleSort {
    public static void bubble(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 8, 9, 6, 3, 7, 2, 5};

        bubble(arr);
        for(int ar: arr){
            System.out.print(ar+" ");
        }
    }
}
