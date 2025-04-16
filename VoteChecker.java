import java.util.Scanner;
public class VoteChecker{
	public boolean canStudentVote(int age){
		boolean canVote = true;
		if(age>=18){
			canVote = true;
		}
		else{
			canVote = false;
		}
		return canVote;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] age = new int[11];
			VoteChecker obj = new VoteChecker();
		for(int i =1; i<=10; i++){
			System.out.println("enter the ages of studetn"+i+": ");
			age[i] = input.nextInt();
			System.out.println(obj.canStudentVote(age[i]));
		}		
	}	
}				