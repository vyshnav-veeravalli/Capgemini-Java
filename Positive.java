import java.util.Scanner;
public class Positive{
	public static int positive(int[] num){
		for(int i=0; i<num.length; i++){
			if(num[i]>=0){
				return num[i];
			}
		}
	}
	
	public static int even(int[] num){
		for(int i=1; i<num.length; i++){
			if(num[i]%2==0){
				return num[i];
			}
		}
	}
	
	public static int compare(int num1,int num2){
		if(num1>num2){
			return 1;
		}
		else if(num1 == num2){
			return 0;
		}
		else{
			return -1;
		}
	}
		
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the five numbers: ");
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++){
			num[i] = input.nextInt();
			if(positive(num)){
				System.out.println(num+" is positive");
				if(even(num)){
					System.out.println(num+" is even");
				}
				else{
					System.out.println(num+" is odd");
				}
			}
			else{
				System.out.println(num+" is negative");
			}
		}
		int result = compare(num[0], num[4]);
		if(result == 1){
			System.out.println("first number is larger than the last");
		}
		else if(result == 0){
			System.out.println("both are equal");
		}
		else{
			System.out.println("first number is less");
		}
	}
}
			
		