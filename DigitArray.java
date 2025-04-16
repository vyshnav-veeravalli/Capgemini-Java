import java.util.Scanner;
public class DigitArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		int maxDigit = 10;
		int[] digits = new int[maxDigit];
		int index = 0;
		while(num!=0 && index < maxDigit){
			digits[index] = num%10;
			num /= 10;
			index++;
		}
		
		for(int i =0; i<index; i++){
			System.out.println(digits[i]);
		}
		
		int largest = -1;
		int secondlargest = -1;
		for(int i =0; i<index; i++){
			if(digits[i]>largest){
				int current = secondlargest;
				largest = digits[i];
			}
			else if(digits[i]>secondlargest && digits[i]!=largest){
				secondlargest=digits[i];
			}
		}
		
		System.out.println("largest: "+largest);
		System.out.println("secondlargest: "+secondlargest);
			
		
		
	}
}