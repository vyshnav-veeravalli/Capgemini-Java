import java.util.Scanner;
public class DayOfWeek{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the day ");
		int day = input.nextInt();
		System.out.println("enter the months ");
		int months = input.nextInt();
		System.out.println("enter the year ");
		int year = input.nextInt();
		
		int y0 = year-(14-months)/12;
		int x = y0+y0/4-y0/100+y0/400;
		int m0 = months+12 * ((14-months)/12)-2;
		int d0 = (day+x+31*m0/12)%7;
		
		switch (d0){
			case 0: System.out.println("Sunday");
			break;
			case 1: System.out.println("Monday");
			break;
			case 2: System.out.println("Teusday");
			break;
			case 3: System.out.println("Wednesday");
			break;
			case 4: System.out.println("Thursday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6: System.out.println("Saturday");
			break;
			
			default:
			System.out.println("Invalid operator");
		}
	}
}				