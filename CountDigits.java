import java.util.Scanner;
public class PowerNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		int digits = 0;
		while(num!=0){
			num /= 10;
			digits++;
		}
		System.out.println(digits);
	}
}				