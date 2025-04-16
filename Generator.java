import java.util.Scanner;
public class Generator{
	public static int[] num(int size){
		int[] num = new int[size];
		for(int i =0; i<size; i++){
			num[i] = (int)(Math.random()*9000)+1000;
		}
		return num;
	}
	
	
	public static double[] find(int[] num){
		int min = num[0];
		int max = num[0];
		int sum = 0;
		for(int n: num){
			sum += n;
			min = Math.min(min, n);
			max = Math.max(max, n);
		}
		double avg = sum/num.length;
		return new double[] {avg, min, max};
	}
	
	public static void main(String[] args){
		int[] random = num(5);
		for(int n: random){
			System.out.println(n);
		}
		
		double[] result = find(random);
		System.out.println("average = "+result[0]+", min = "+result[1]+", max = "+result[2]);
	}
}
		
		