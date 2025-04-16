import java.util.Scanner;
public class GreatestFactor{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		for( int i = num-1; i>=1; i--){
			if(num%i==0){
				System.out.println(i);
				break;
			}
			else{
				System.out.println("prime number");
		}
	}
}