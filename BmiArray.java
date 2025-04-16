import java.util.Scanner;
public class ReverseArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num of players: ");
		int num = input.nextInt();
		int[] height = new int[num];
		int[] weight = new int[num];
		double[] BMI = new double[num];
		
		for(int i = 0; i<num; i++){
			System.out.println("enter the height of player "+(i+1));
			height[i] = input.nextInt();
			System.out.println("enter the weight of player "+(i+1));
			weight[i] = input.nextInt();
			BMI[i] = weight[i]/((height[i]*height[i])/10000);
			if(BMI[i]<=18.4){
			System.out.println("UnderWeight");
		}
		else if(BMI[i]>=18.5 && BMI[i]<=24.9){
			System.out.println("Normal");
		}
		else if(BMI[i]>=25.0 && BMI[i]<=39.9){
			System.out.println("overweight");
		}
		else{
			System.out.println("obesity");
		}
		}
	}
}