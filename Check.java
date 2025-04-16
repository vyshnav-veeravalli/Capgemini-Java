import java.util.Scanner;
public class Check{
	public static int checking(int num){
		if (num>0){
			return 1;
		}
		else if (num<0){
			return -1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		System.out.println(" enter the number: ");
		int num = input.nextInt();
		int checked = checking(num);
		System.out.println(checked);	
	}
}	
		