import java.util.Scanner;
class Unit{
	public static double yards2feet(double num){
		double feet = num/3;
		return feet;
	}
	public static double feets2yard(double num){
		double yard = num*0.33333;
		return yard;
	}
	public static double meters2inche(double num){
		double inche = num*39.3701;
		return inche;
	}
	public static double inches2meters(double num){
		double meters = num/0.254;
		return meters;
	}
	public static double inches2cm(double num){
		double cm = num*2.54;
		return cm;
	}
		
		
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		System.out.println("yards to feet: "+yards2feet(num));
		System.out.println("feet to yards: "+feets2yard(num));
		System.out.println("meters to inches: "+meters2inche(num));
		System.out.println("inches to meter: "+inches2meters(num));
		System.out.println("inches to cm: "+inches2cm(num));
	}	
}				