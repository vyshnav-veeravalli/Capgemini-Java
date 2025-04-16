import java.util.Scanner;
class Main{
	public static int sumRecurssion(int num){
		int sum = 0;
		for(int i=1; i<=num; i++){
			sum += i;
		}
		return sum;
	}
	
	public static int sumFormula(int num){
		int sum = num*(num+1)/2;
		return sum;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = input.nextInt();
		int sumF = sumFormula(num);
		int sumR = sumRecurssion(num);
		System.out.println("sum of the number by reccurssion: "+sumR);
		System.out.println("sum of the number by Formula: "+sumF);
	}		
			
}	
		