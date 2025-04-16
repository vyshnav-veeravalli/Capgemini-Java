import java.util.Scanner;
class Unit{
	public static double farhenheit2celsius (double num){
		double celsius = (num-32)*5/9;
		return celsius;
	}
	public static double celsius2farhenheit (double num){
		double farhenheit = (num*9/5)+32;
		return farhenheit;
	}
	public static double pounds2kilograms (double num){
		double kilograms  = num*0.453592;
		return kilograms;
	}
	public static double kilograms2pounds (double num){
		double pounds = num/2.20642;
		return pounds;
	}
	public static double gallons2liters (double num){
		double liters = num*3.78541;
		return liters ;
	}
	public static double liters2gallons  (double num){
		double gallons = num/0.264172;
		return gallons ;
	}
	
		
		
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		System.out.println("farhenheit2celsius: "+farhenheit2celsius(num));
		System.out.println("celsius2farhenheit: "+celsius2farhenheit(num));
		System.out.println("pounds2kilograms: "+pounds2kilograms(num));
		System.out.println("kilograms2pounds: "+kilograms2pounds(num));
		System.out.println("gallons2liters: "+gallons2liters(num));
		System.out.println("liters2gallons: "+liters2gallons(num));
	}	
}				