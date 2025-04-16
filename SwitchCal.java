import java.util.Scanner;
public class SwitchCal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num1 ");
		int num1 = input.nextInt();
		System.out.println("enter the num2 ");
		int num2 = input.nextInt();
		System.out.println("enter the op ");
		String op = input.next();
		double result;
		
		switch(op){
			case "+": result = num1+num2;
			System.out.println("addition: "+result);
			break;
			case "-": result = num1-num2;
			System.out.println("Subtraction: "+result);
			break;
			case "*": result = num1*num2;
			System.out.println("Multiplication: "+result);
			break;
			case "/": result = num1/num2;
			System.out.println("Division: "+result);
			break;
			
			default:
			System.out.println("Invalid operator");
		}
	}
}				