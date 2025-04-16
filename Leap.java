import java.util.Scanner;
public class Leap{
	public static void year(int num){
		while(num>=	1582){

		if(num%4==0 && num%100!=0 &&num%400!=0){
		System.out.println("leap year");
		}
		else{
			if(num%100==0){
				if(num%400==0){
					System.out.println("leap year");
				}
				else{
					System.out.println("not a leap year");
				}
			}
			else{
				System.out.println("not a leap year");
			}
		}
		
	}}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the year: ");
		int num = input.nextInt();
		year(num);
	}	
}				