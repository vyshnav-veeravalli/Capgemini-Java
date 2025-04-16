import java.util.Scanner;
public class Bonus{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the salary: ");
		double salary = input.nextDouble();
		System.out.println("enter the year of service: ");
		double service = input.nextDouble();
		int bonus = 5;
		if(service>=5){
			bonus *= salary/100;
			System.out.println("bonus amount of the emplyoee: "+bonus);
		}
		else{
			System.out.println("bonus amount is not provided to the emplyoee");
		}
	}
}