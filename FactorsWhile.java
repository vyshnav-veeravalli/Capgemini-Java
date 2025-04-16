import java.util.Scanner;
public class FactorsWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		int i = 1;
		while(i<=num){
			if(num%i == 0){
				System.out.println(i);
			}
			i++;
		}
	}
}