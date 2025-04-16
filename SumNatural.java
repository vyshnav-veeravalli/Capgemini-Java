import java.util.Scanner;
public class SumNatural{
	public static int sum(int num){
		int sum = 0;
		for (int i =1; i<=num; i++){
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numer: ");
		int num = input.nextInt();
		int output = sum(num);
		System.out.println("sum of the numer = "+output);
	}
}	
		