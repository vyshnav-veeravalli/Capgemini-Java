import java.util.Scanner;
public class QuotiantRemainder{
	public static void find(int num1, int num2){
		double remainder = num1/num2;
		double quotiant = num1%num2;
		System.out.println("remainder = "+remainder);
		System.out.println("quotiant = "+quotiant);
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		find(num1, num2);		
	}
}	
		