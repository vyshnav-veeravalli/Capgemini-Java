import java.util.Scanner;
public class CheckPositive{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		
		if(num>0){
			System.out.println("Positive");
		}
		else if(num<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
	}
}