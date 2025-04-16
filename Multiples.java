import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		for(int i = 100; i>num; i--){
			if(i%num==0){
				System.out.println(i);
				
			}
		}
	}
}