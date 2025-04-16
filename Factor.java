import java.util.Scanner;
class Main{
	public static int[] factors(int num){
		int count = 0;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				count++;
			}
		}
		
		int[] factors = new int[count];
		int index = 0;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				factors[index++]=i;
			}
		}
		return factors;
	}
	
	public static int sum(int[] factors){
		int sum =0;
		for(int i =1; i<factors.length; i++){
			sum += factors[i];
		}
		return sum;
	}
	
	public static int power(int[] factors){
		int sum = 0;
		for(int i=1; i<factors.length; i++){
			 sum += Math.pow(factors[i], 2);
			
		}
		return sum;
	}
	
	public static long product(int[] factors){
		long prod = 1;
		for(int i=1; i<factors.length; i++){
			prod *= factors[i];
		}
		return prod;
	}
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = input.nextInt();
		int[] a1 = factors(num);
		int k0 = sum(a1);
		int n9 = power(a1);
		long f3 = product(a1);
		
		for(int i=1; i<a1.length; i++){
			System.out.println("factors of the number: "+a1[i]);
		}
		System.out.println("sum of the factors: "+k0);
		System.out.println("power of the number: "+n9);
		System.out.println("product of the number: "+f3);
	}
}	
		