import java.util.Scanner;
public class SumOfNatural{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		double num = input.nextDouble();
		double sum = num * (num + 1) / 2;
		while(num>=1){
			total += num;
			num--;
		}
		
		System.out.println("sum with Formula: " + sum);
		System.out.println("sum with While Loop: "+total);
			
	}
}