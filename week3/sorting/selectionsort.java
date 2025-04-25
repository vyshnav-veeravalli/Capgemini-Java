package week3.sorting;

public class selectionsort {
    public static void sort(int[] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n-1; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr ={ 1,8,6,7,3,5,4,9,0};
        sort(arr);
        for(int val: arr){
            System.out.println(val+" ");
        }
    }
}
