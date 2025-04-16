import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the year: ");
		int n=1,year;
		while(n++<100){
		year = input.nextInt();
		if(year%4==0 && year%100!=0 &&year%400!=0){
			System.out.println("leap year");
		}
		else{
			if(year%100==0){
				if(year%400==0){
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
}				