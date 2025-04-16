import java.util.Scanner;
public class Smallest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		if(num1<num2 && num1<num3){
			System.out.println("Is the first number the smallest? yes");
		}
		else{
			System.out.println("Is the first number the smallest? no");
		}
	}
}