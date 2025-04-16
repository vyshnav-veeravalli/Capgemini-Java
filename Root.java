import java.util.Scanner;
public class Root{
	public static double[] cal(double a, double b, double c){
		double delta = Math.pow(b,2) -4*a*c;
		if(delta>0){
			double root1 = (-b + Math.sqrt(delta))/(2*a);
			double root2 = (-b - Math.sqrt(delta))/(2*a);
			
			return new double[]{root1, root2};
		}
		else if (delta == 0){
			double root = -b/2*a;
			return new double[]{root};
		}
		else{
			return new double[]{};
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a, b, c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double roots[] = cal(a,b,c);
		
		if(roots.length == 2){
			System.out.println("Roots: " + roots[0] + " and " + roots[1]);
		}
		else if(roots.length == 1){
			System.out.println(roots[0]);
		}
		else{
			System.out.println("no roots");
		}
		
	}
}
		
		