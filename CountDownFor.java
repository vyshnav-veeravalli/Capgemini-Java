import java.util.Scanner;
public class CountDownFor{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for (int i = num; i>=1; i--){
			System.out.println(i);
		}
		System.out.println("Rocket Launch");
	}
}