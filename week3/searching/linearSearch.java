package week3.searching;

public class linearSearch {
    public static void main(String[] args){
        int[] arr = {2, 6, 88, 7, 6, -5, 4, 6, };
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]<0){
                System.out.println(i);
                return;

            }
        }
        System.out.println(-1);
    }
}
