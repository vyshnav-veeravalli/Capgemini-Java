import java.util.Scanner;
public class ArrayEnto{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("enter the numbers: ");
		for(int i = 0; i<nums.length; i++){
			nums[i] = input.nextInt();	
		}
		for(int i = 0; i<nums.length; i++){
		if(nums[i]>0){
				System.out.println(nums[i]+" is positive");
				if(nums[i]%2==0){
					System.out.println(nums[i]+" is even");
				}
				else{
					System.out.println(nums[i]+" is odd");
				}					
			}
		else if(nums[i]<0){
			System.out.println(nums[i]+" is negative");
		}
		else{
			System.out.println("zero");
		}
		}
		if(nums[0]<nums[4]){
			System.out.println(nums[0]+" is smaller than "+nums[4]);
		}
		else if(nums[0]>nums[4]){
			System.out.println(nums[0]+" is greater than "+nums[4]);
		}
		else{
			System.out.println(nums[0]+" is equal to "+nums[4]);
		}		
	}
}
		