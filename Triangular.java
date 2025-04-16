import java.util.Scanner;
public class Triangular{
	public static double distance(double side1, double side2, double side3){
		double rounds = 5000/(side1+side2+side3);
		return rounds;
		
	}
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		System.out.println(" enter the size of side1: ");
		double side1 = input.nextInt();
		System.out.println(" enter the size of side2: ");
		double side2 = input.nextInt();
		System.out.println(" enter the size of side3: ");
		double side3 = input.nextInt();
		double rounds = distance(side1, side2, side3);
		System.out.println("number of rounds = "+rounds);
	}
}	
		