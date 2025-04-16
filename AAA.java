import java.util.Scanner;
public class AAA{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the Amar's age and height: ");
		int age1 = input.nextInt();
		int h1 = input.nextInt();
		System.out.println("enter the Akbar's age and height: ");
		int age2 = input.nextInt();
		int h2 = input.nextInt();
		System.out.println("enter the Antony's age and height: ");
		int age3 = input.nextInt();
		int h3 = input.nextInt();
		
		String Young;
		if(age1<age2 && age1<age3){
			Young = "Amar";
		}
		else if(age2<age1 && age2<age3){
			Young = "Akbar";
		}
		else{
			Young = "Antony";
		}
		
		String Tall;
		if(h1>h2 && h1>h3){
			Tall = "Amar";
		}
		else if(h2>h1 && h2>h3){
			Tall = "Akbar";
		}
		else{
			Tall = "Antony";
		}
		System.out.println("The youngest friend is: " + Young);
        System.out.println("The tallest friend is: " + Tall);
	}
}