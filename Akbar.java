import java.util.Scanner;
public class Akbar{
	public static int tall(int[] height){
		int taller = 0;
		for(int i=0; i<height.length; i++){
			if(height[i]>height[taller]){
				taller = i;
			}
		}
		return taller;
	}
	
	public static int young(int[] age){
		int young = 0;
		for(int i=0; i<age.length; i++){
			if(age[i]<age[young]){
				young = i;
			}
		}
		return young;
	}
			
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] names = {"Amar", "akbar", "antony"};
		int[] age = new int[3];
		int[] height = new int[3];
		for(int i=0; i<3; i++){
			System.out.println("enter the age of "+names[i]);
			age[i] = input.nextInt();
			System.out.println("enter the height of "+names[i]);
			height[i] = input.nextInt();
		}
		int youngest = young(age);
		int tallest = tall(height);
		
		System.out.println("youngest = "+names[youngest]);
		System.out.println("tallest = "+names[tallest]);
		
	}
}
			
		