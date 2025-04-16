import java.util.Scanner;
public class Chocolates{
	public static void find(int children, int chocolates){
		int remainder = chocolates/children;
		int quotiant = chocolates%children;
		System.out.println("each child gets= "+remainder);
		System.out.println("left over chocolates= "+quotiant);
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numer of children: ");
		int children = input.nextInt();
		System.out.println("enter the numer of chocolates: ");
		int chocolate = input.nextInt();
		
		find(children, chocolate);		
	}
}	
		