import java.util.Scanner;

public class Distance{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the distance in km");
		double km = input.nextDouble();
		double mile = km/1.6;
		
		System.out.println("the total miles is "+ mile + "mile for the given " + km + "km");
	}
}
		