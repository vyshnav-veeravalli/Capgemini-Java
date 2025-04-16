import java.util.Scanner;
class Main{
	public double[] calculate(double angle){
		double[] results = new double[3];
		double radians = Math.toRadians(angle);
		results[0]=Math.sin(radians);
		results[1]=Math.cos(radians);
		results[2]=Math.tan(radians);
		
		return results;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the angle: ");
		double angle = input.nextDouble();
		Main obj = new Main();
		double[] result = obj.calculate(angle);	
		System.out.println(result[0]);	
		System.out.println(result[1]);	
		System.out.println(result[2]);			
	}
}	
		