import java.util.Scanner;
public class NumberChecker{
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
	
	public static boolean isDuck(int[] digits){
		for(int i=0; i<digits.length; i++){
			if(digits[i]==0){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isAmstrong(int[] digits, int num){
		int power = digits.length;
		int sum = 0;
		for(int digit: digits){
			sum += Math.pow(digit, power);
		}
		return sum == num;
	}
	
	public static void min(int[] digits){
		int firstmin = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		
		for (int digit: digits){
			if(digit<firstmin){
				secondmin = firstmin;
				firstmin = digit;
			}
			else if(digit<secondmin && digit!=firstmin){
				secondmin = digit;
			}
		}
		System.out.println("First Min digit: " + firstmin);
        System.out.println("Second min digit: " + secondmin);
	}
	
	public static void max(int[] digits){
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int digit: digits){
			if(digit>firstMax){
				secondMax = firstMax;
				firstMax = digit;
			}
			else if(digit>secondMax && digit!=firstMax){
				secondMax = digit;
			}
		}
		System.out.println("first max digit: " + firstMax);
        System.out.println("Second max digit: " + secondMax);
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
		
		if(isDuck(digits)){
			System.out.print("it is duck");
		}
		else{
			System.out.print("it is not duck");
		}
		
		if(isAmstrong(digits, num)){
			System.out.print("it is a Amstrong number");
		}
		else{
			System.out.print("it is not a amstrong number");
		}
		
		
		min(digits);
		max(digits);
	}
	
}
		
		
				
			
		
			
			
			
			