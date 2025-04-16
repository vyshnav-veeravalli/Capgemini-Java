import java.util.Scanner;
public class PowerNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		double remainder;
		double cube;
		double result = 0;
		int realNum =num;
		while(realNum != 0){
			remainder = realNum % 10;
			cube = Math.pow(remainder,3);
			result += cube;
			realNum /= 10;
		}
		if (result == num){
			System.out.println(num+" is a armstrong number");
		}
		else{
			System.out.println(num+" is not a armstrong number");
		}
	}
}				