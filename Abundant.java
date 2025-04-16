import java.util.Scanner;
public class Abundant{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num ");
		int num = input.nextInt();
		int sum = 0;
		for(int i=1; i<num; i++){
			if(num%i==0){
				sum += i;
			}
		}
		if(sum>num){
			System.out.println("the number is abundant "+sum+" > "+num);
		}
		else{
			System.out.println("the number is not abundant "+sum+" < "+num);
		}		
	}
}				