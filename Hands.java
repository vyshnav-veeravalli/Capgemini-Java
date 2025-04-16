import java.util.Scanner;

public class Hands{
	public static double students(int num){
		double handshake = (num*(num-1))/2;
		return handshake;
		
	}
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		System.out.println(" enter the number of students: ");
		int num = input.nextInt();
		double handshake = students(num);
		
		
		System.out.println("number of handshakes = "+handshake);
	}
}	
		