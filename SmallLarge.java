import java.util.Scanner;
public class SmallLarge{
	public static void find(int num1, int num2, int num3){
		int smallest = num1;
		int largest = num1;
		
		if(num2<smallest){
			smallest = num2;
		}
		if(num3<smallest){
			smallest = num3;
		}
		
		if(num2>largest){
			largest = num2;
		}
		if(num3>largest){
			largest = num3;
		}
		
		System.out.println("Smallest numer: "+smallest);
		System.out.println("Largest numer: "+largest);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		find(num1, num2, num3);		
	}
}	
		