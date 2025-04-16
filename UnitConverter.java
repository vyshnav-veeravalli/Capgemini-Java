import java.util.Scanner;
public class Unit{
	public static double km2miles(double km){
		double mile = km/0.621371;
		return mile;
	}
	public static double miles2km(double mile){
		double kilometer = mile*1.60934;
		return kilometer;
	}
	public static double km2meters(double kilometer){
		double meter = kilometer*1000;
		return meter;
	}
	public static double meters2feet(double meter){
		double feet = meter/3.28084;
		return feet;
	}
	public static double feet2meters(double feet){
		double meters = feet*0.3048;
		return meters;
	}
		
		
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the km: ");
		int km = input.nextInt();
		System.out.println("kilometer to meters: "+km2meters(km));
		System.out.println("miles to kilometer: "+miles2km(km));
		System.out.println("kilommeters to meters: "+km2meters(km));
		System.out.println("meters to feet: "+meters2feet(km));
		System.out.println("feet to meters: "+feet2meters(km));
	}	
}				