import java.util.Scanner;
public class Divisible{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		if(num % 5 == 0){
			System.out.println("is the number "+num+" divisible by 5 ? yes");
		}
		else{
			System.out.println("is the number "+num+" divisible by 5 ? no");
		}
	}
}