import java.util.Scanner;
public class ArrayVote{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] ages = new int[10];
		System.out.println("Enter the age of students");
		for(int i=0; i<ages.length; i++){
			ages[i] = input.nextInt();
			if (ages[i]<=0){
				System.out.println("print valid number");
				i--;
			}
		}
		System.out.println("results: ");
		for(int i = 0; i<ages.length; i++){
			if(ages[i]>=18){
				System.out.println("student "+ i +" can vote coz his age is "+ages[i]);
			}
			else{
				System.out.println("student "+ i +" cannot vote coz his age is "+ages[i]);
			}
		}
	}
}				