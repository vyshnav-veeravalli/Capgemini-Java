import java.util.Scanner;
public class Natural{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		
		if(num>=0){
			double sum = num*(num+1)/2;
			System.out.println("The sum of "+num+" natural numbers is " +sum);
		}
		else{
			System.out.println("The number "+num+" is not a natural number");

		
		}
	}
}