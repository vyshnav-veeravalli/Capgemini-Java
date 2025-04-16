import java.util.Scanner;
public class ArrayMulTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] table = new int[10];
		System.out.println("enter the number: ");
		int num = input.nextInt();
		for(int i =0; i<10; i++){
			table[i] = num*(i+1);
			System.out.println(num+"x"+(i+1)+"="+table[i]);	
		}		
	}
}