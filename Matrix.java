import java.util.Scanner;
public class Matrix{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter the rows: ");
		int rows = input.nextInt();
		System.out.println("enter the cols: ");
		int cols = input.nextInt();
		int[] array = new int[rows*cols];
		int[][] matrix = new int[rows][cols];
		int index =0 ;
		
		System.out.println("enter the elements to the matrix");
		for(int i =0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				System.out.println("element["+i+"] ["+j+"]");
				matrix[i][j] = input.nextInt();
			}
		}
		
		for(int i =0; i< rows; i++){
			for(int j = 0; j<cols; j++){
				array[index] = matrix[i][j];
				index++;
			}
		}
		for(int i =0; i <rows; i++){
			for(int j =0; j< cols; j++){
				System.out.println(matrix[i][j]+" ");
			}
		}
		
		for(int i =0; i<array.length; i++){
			System.out.println(array[i]+" ");
		}
				
	}
}