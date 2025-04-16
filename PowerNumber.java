import java.util.Scanner;
public class PowerNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		System.out.println("enter the power: ");
		int power = input.nextInt();
		int result =1;
		if (power>0){
			for(int i = 1; i<=power; i++){
				result *= num;
			}
			System.out.println(result);
		}
		else{
			System.out.println("enter valid number");
		}
	}
}				