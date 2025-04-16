import java.util.Scanner;
public class NumberChecker4{
	public static int count(int num){
		int count =0;
		while(num!=0){
			num/=10;
			count++;
		}
		return count;
	}
	
	public static int[] digits(int num, int count){
		int[] digits = new int[count];
		for(int i=count-1; i>=0; i--){
			digits[i] = num%10;
			num /= 10;
		}
		return digits;
	}
	
	public static boolean isPrime(int num){
		for(int i=2; i<Math.sqrt(num); i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean isNeon(int num){
		double squared = Math.pow(num,2);
		int sum =0;
		while(squared!=0){
			sum += squared%10;
			squared /= 10;
		}
		return sum == num;
	}
	
	
	
	public static boolean isSpy(int[] digits){
		int sum = 0;
		double mul = 1;
		for(int i = 0; i<digits.length; i++){
			sum += digits[i];
			mul *= digits[i];
		}
		
		return sum == mul;
	}
	
	
	public static boolean isAuto(int num){
		int squared = num*num;
		int lastdigit = squared%10;
		int numdigit = num%10;
		if(lastdigit == numdigit){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static boolean isBuzz(int num){
		if(num%7==0 || num%10==7){
			return true;
		}
		else{
			return false;
		}
	}
	
			
			
		
		
	

	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		int count = count(num);
		int[] digits = digits(num, count);
		
		System.out.print("Count: "+count);
		for(int digit: digits){
			System.out.print(digit+" ");
		}
		System.out.println();	
		
		System.out.println("is prime number: "+isPrime(num));
		System.out.println("is Neon number: "+isNeon(num));
		System.out.println("is Spy number: "+isSpy(digits));
		System.out.println("is Buzz number: "+isBuzz(num));
		System.out.println("is Automorphic number: "+isAuto(num));
	}	
}