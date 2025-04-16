import java.util.Scanner;
public class Spring{
	public static boolean isSpring(int month, int day){
		if ((month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20)){
			return true;
		}
		else{
			return false;
		}	
	}
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		System.out.println(" enter the month: ");
		int month = input.nextInt();
		System.out.println(" enter the day: ");
		int day = input.nextInt();
		if(isSpring(month, day)){
			System.out.println("it is a spring season");
		}
		else{
			System.out.println("it is not a spring season");
		}
	}
}	
		