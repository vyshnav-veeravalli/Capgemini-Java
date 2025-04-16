import java.util.Scanner;
public class PowerNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		boolean IsPrime = true;
		if (num<=1){
			IsPrime = false;
		}
		else {
			for(int i = 2; i<num; i++){
				if(num%i==0){
					IsPrime = false;
					break;
				}
			}
		}
		if(IsPrime){
		System.out.println(num+" is a prime numer");
		}
		else{
			System.out.println(num+" is not a prime numer");
		}
	}
}				