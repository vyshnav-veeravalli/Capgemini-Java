import java.util.Scanner;
public class FactorialWhile{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double total = 1;
		double num = input.nextDouble();
		while (num>=1){
			total *= num;
			num--;
			
		}
		System.out.println("Factorial with While Loop: "+total);
			
	}
}