import java.util.Scanner;
public class FootbaallHeight{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] height = new double[11];
		double mean;
		double sum = 0;
		for(int i =0; i<height.length; i++){
			System.out.println("enter the height of player "+i);
			height[i] = input.nextInt();
			sum += height[i];
		}
		mean = sum/height.length;
		System.out.println("the mean is: " + mean);
		
	}
}