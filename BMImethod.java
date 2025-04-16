import java.util.Scanner;
public class BMImethod{
	public static void calculate(double[][] data){
		for(int i =0; i<data.length; i++){
			double weight = data[i][0];
			double height = data[i][1];
			double height2meters = height/100.0;
			
			double bmi = weight/(height2meters*height2meters);
			data[i][2] = bmi;
		}
	}
	public static String[] statusofbmi(double[][] data){
		String[] status = new String[data.length];
		
		for(int i = 0; i<data.length; i++){
			double bmi = data[i][2];
			
			if(bmi<=18.4){
				status[i] = "underWeight";
			}
			if(bmi<=24.9){
				status[i] = "normal";
			}
			if(bmi<=39.9){
				status[i] = "overweight";
			}
			else{
				status[i] = "obesity";
			}
		}
		return status;
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[][] data = new double[10][3];
		for(int i=0; i<data.length; i++){
			System.out.println("enter weight of person "+(i+1));
			data[i][0] = input.nextDouble();
			System.out.println("enter height of person "+(i+1));
			data[i][1] = input.nextDouble();
		}
		calculate(data);
		String[] finalstatus = statusofbmi(data);
		for(int i=0; i<data.length; i++){
			System.out.println("bmi of person "+(i+1)+data[i][2]+" "+finalstatus[i]);
		}
	}
}
			
			
			