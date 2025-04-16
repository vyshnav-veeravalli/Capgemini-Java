import java.util.Scanner;
public class ArrayTableMul{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] table = new double[10];
		System.out.println("enter the num ");
		int num = input.nextInt();
		if(num >=6 && num<=9){
			for(int i = 0 ; i<table.length; i++){
				table[i]= (i+1)*num;
				System.out.println(num+" X "+(i+1)+" = "+table[i]);
			}
		}
		else{
			System.out.println("enter number between 6 to 9");
		}
		
	}
}