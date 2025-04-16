import java.util.Scanner;

public class Average{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the number of values: ");
		int n = scanner.nextInt();
		double sum = 0;
		
		System.out.println("enter " + n + " values: ");
		for (int i=0; i<n; i++){
			sum += scanner.nextDouble();
		}
		
		double average = sum / n;
		
		System.out.println("the average is: "+ average);
	}
}
		