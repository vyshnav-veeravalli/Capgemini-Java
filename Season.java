import java.util.Scanner;
public class Season{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the month: ");
		double month = input.nextDouble();
		System.out.println("enter the date: ");
		double date = input.nextDouble();
		
		if(month==3){
			if (date>=20 && date<=31){
				System.out.println("Its a Spring Season");
			}
			else {
				System.out.println("Not a Spring Season");
			}
		}
		else if(month>3 && month<6){
			System.out.println("Its a Spring Season");
		}
		else if (month==6){
			if (date>=1 && date<=20){
				System.out.println("Its a Spring Season");
			}
			else {
				System.out.println("Not a Spring Season");
			}
		}
		else{
			System.out.println("Not a Spring Season");
		}
			
	}
}