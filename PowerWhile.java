import java.util.Scanner;
public class PowerNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		System.out.println("enter the power: ");
		int power = input.nextInt();
		int i =1;
		int result =1;
		while(i<=power){
			result*=num;
			i++;
		}
		System.out.println(result);
	}
}				