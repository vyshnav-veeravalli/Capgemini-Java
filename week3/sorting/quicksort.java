package week3.sorting;

public class quicksort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void sort(int[] arr, int low, int high){
        if(low < high){
            int pivotindex = partition(arr, low, high);
            sort(arr, low, pivotindex - 1);      // fixed recursive call
            sort(arr, pivotindex + 1, high);     // fixed recursive call
        }
    }

    public static void main(String[] args){
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        sort(myArray, 0, myArray.length - 1);

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}
