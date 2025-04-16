import java.util.Scanner;
public class SumOfNaturalFor{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		double num = input.nextDouble();
		double sum = num * (num + 1) / 2;
		for(int i=1; i<=num; i++){
			sum += num;
		}
		
		System.out.println("sum with Formula: " + sum);
		System.out.println("sum with While Loop: "+total);
			
	}
}