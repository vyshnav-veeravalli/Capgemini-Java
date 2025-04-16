import java.util.Scanner;
public class CountDown{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		
		while (num>=1){
			System.out.println(num);
			num--;
		}
		System.out.println("Rocket Launch");
	}
}