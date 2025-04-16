import java.util.Scanner;
public class FactorsArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		int index = 0;
		int maxFactors = 10;
		int[] factors = new int[maxFactors];
		
		for(int i = 1; i<num; i++){
			if(num%i==0){
				if(index==maxFactors){
					maxFactors*=2;
					int[] temp = new int[maxFactors];
					for(int j =0; j<factors.length; j++){
						temp[j] = factors[j];
					}
					factors = temp;
				}
				factors[index] = i;
				index++;
			}
		}
		for(int i =1; i<index; i++){
			System.out.println(factors[i]);
		}
				
	}
}