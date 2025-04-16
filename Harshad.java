import java.util.Scanner;
public class Harshad{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num ");
		int num = input.nextInt();
		int sum = 0;
		int temp = num;
		int remainder;
		while(temp!=0){
			remainder = temp%10;
			sum += remainder;
			temp /= 10;
		}
		if(num%sum==0){
			System.out.println("it is a harshadh number ");
		}
		else{
			System.out.println("not a harshadh number");
		}
		
	}
}				