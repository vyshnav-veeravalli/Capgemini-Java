import java.util.Scanner;
public class Chill{
	public double find(double temp, double windspeed){
		double windChill = 35.74+0.6215*temp+(0.4275*temp-35.75)*windspeed;
		
		return windChill;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the temp: ");
		double temp = input.nextDouble();
		System.out.println("enter the windspeed: ");
		double windspeed = input.nextDouble();
		
		Chill obj = new Chill();
		
		double windChill = obj.find(temp, windspeed);	
		System.out.println("wind chill = "+windChill);		
	}
}	
		