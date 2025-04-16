import java.util.Scanner;
public class NumberChecker2{
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
	
	public static int sum(int[] digits){
		int sum=0;
		for(int i=0; i<digits.length; i++){
			sum += digits[i];
		}
		return sum;
	}
	
	public static int square(int[] digits){
		
		int sum = 0;
		for(int digit: digits){
			sum += Math.pow(digit, 2);
		}
		
	}
	
	public static boolean isHrshad(int num, int sum){
		if(num%sum == 0){
			return true;
		}
		return false;
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
		
		int sumOFNumbers = sum(num);
		System.out.println(sumOFNumbers);
		
		int squareOfSum = square(digits);
		System.out.println(squareOfSum);
		
		if(isHrshad(num, sum)){
			System.out.println("is a harshadh number");
		}
		else{
			System.out.println("not a harshad number");
		}
	}
	
}
		
		
				
			
		
			
			
			
			