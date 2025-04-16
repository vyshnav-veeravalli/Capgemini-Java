import java.util.Scanner;
public class FactorialFor{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double total = 1;
		double num = input.nextDouble();
		for(int i=1; i<=num; i++){
			total *= i;
			
		}
		
		System.out.println("Factorial with While Loop: "+total);
			
	}
}