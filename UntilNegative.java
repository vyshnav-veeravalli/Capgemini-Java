import java.util.Scanner;
public class UntilNegative{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		
		while(true){
			double num = input.nextDouble();
			if (num<=0){
				break;
			}
			total += num;
		}
		System.out.println("The total sum of numbers entered is: " + total);
			
	}
}