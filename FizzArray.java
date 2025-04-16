import java.util.Scanner;
public class Matrix{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		String[] name = new String[num+1];
		for(int i =1; i<=num; i++){
			if(i%3==0 && i%5==0){
				name[i] = "FizzBuzz";
			}
			else if(i%3==0){
				name[i] = "Fizz";
			}
			else if(i%5==0){
				name [i] ="Buzz";
			}
			else{
				name[i] = Integer.toString(i);
			}
		}
		for(int i=1; i<=num; i++){
			System.out.println(name[i]);
		}	
	}
}