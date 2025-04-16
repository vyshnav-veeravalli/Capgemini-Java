import java.util.Scanner;
public class PowerNumber{
	public static void main(String[] args){
		
		System.out.println("input= "+args.length);
		Scanner input = new Scanner(System.in);
		System.out.println("enter the marks for Physics: ");
		int phy = input.nextInt();
		System.out.println("enter the marks for Chemistry: ");
		int che = input.nextInt();
		System.out.println("enter the marks for Maths: ");
		int mat = input.nextInt();
		double maxMarks = 300;
		double TotalMarks = phy + che + mat;
		double percentage = (TotalMarks/maxMarks)*100;
		if(percentage>=80){
			System.out.println("Grade: 'A'");
			System.out.println("Remarks: 'Level 4, above agency-normalized standards'");
		}
		else if(percentage>=70 && percentage<=79){
			System.out.println("Grade: 'B'");
			System.out.println("Remarks: 'Level 3, at agency-normalized standards'");
		}
		else if(percentage>=60 && percentage<=69){
			System.out.println("Grade: 'C'");
			System.out.println("Remarks: 'Level 2, below, but approaching agency-normalized standards'");
		}
		else if(percentage>=50 && percentage<=59){
			System.out.println("Grade: 'D'");
			System.out.println("Remarks: 'Level 3, well below agency-normalized standards'");
		}
		else if(percentage>=40 && percentage<=49){
			System.out.println("Grade: 'E'");
			System.out.println("Remarks: 'Level 3, too below agency-normalized standards'");
		}
		else{
			System.out.println("Grade: 'R'");
			System.out.println("Remarks: 'Remedial standards'");
		}
	}
}				