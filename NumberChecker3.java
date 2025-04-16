import java.util.Scanner;
public class NumberChecker3{
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
	
	public static int[] reversed(int[] digits, int count){
		int[] reversed = new int[count];
		for(int i=0; i<count; i++){
			reversed[i] = digits[count - 1 -i];
		}
		return reversed;
	}
	
	public static boolean isequal(int[] digits, int[] reversed){
		for(int i=0; i<digits.length; i++){
			if(digits[i] == reversed[i]){
				return true;
			}	
		}
		return false;
	}
	
	public static boolean isDuck(int[] digits){
		for(int i=0; i<digits.length; i++){
			if(digits[i]==0){
				return true;
			}
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
		
		int[] reversed = reversed(digits, count);
		for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();
		
		
		if(isequal(digits, reversed)){
			System.out.println("is a equal array and a palindrom");
		}
		else{
			System.out.println("not a equal and palindrom");
		}
		
		if(isDuck(digits)){
			System.out.println("is a duck number");
		}
		else{
			System.out.println("is a not a duck number");
		}
	}
	
}
		
		
				
			
		
			
			
			
			