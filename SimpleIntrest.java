import java.util.Scanner;

public class SimpleIntrest{
	public static double intrest(double time, double rate, double principle){
		double si = (time*rate*principle)/100;
		return si;
	}
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		System.out.println(" enter time: ");
		double time = input.nextDouble();
		System.out.println(" enter rate: ");
		double rate = input.nextDouble();
		System.out.println(" enter principle: ");
		double principle = input.nextDouble();
		
		double calculation = intrest(time, rate, principle);
		
		System.out.println("the simple intrest is "+calculation+" for principle "+principle+", rate of intrest "+rate+", and time "+time);
	}
}	
		