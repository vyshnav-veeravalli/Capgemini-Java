import java.util.Scanner;
public class FizzBuzzWhile{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		int i=num;
		while(i==num){
			if(i%5==0 & i%3==0){
				System.out.println("FIZZBUZZ");
			}
			else if(i%3==0){
				System.out.println("FIZZ");
			}
			else if(i%5==0){
				System.out.println("BUZZ");
			}
			else{
				System.out.println(i);
			}
			i++;
		}
	}
}