import java.util.Scanner;
public class EvenArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int num = input.nextInt();
		int[] EvenArray = new int[(num/2)+1];
		int[] OddArray = new int[(num/2)+1];
		if(num<=0){
			System.out.println("enter natural numbers: ");
		}
		
		int OddIndex = 0;
		int EvenIndex = 0;
		for(int i = 1 ; i<num; i++){
			if(i%2==0){
				EvenArray[EvenIndex] = i;
				EvenIndex++;
			}
			else{
				OddArray[OddIndex] = i;
				OddIndex++;
			}
		}
		System.out.println("Even number: ");
		for(int i =0 ; i<EvenIndex; i++){
			System.out.print(EvenArray[i]+" ");
		}
		System.out.println("\nOdd number: ");
		for(int i =0 ; i<OddIndex; i++){
			System.out.print(OddArray[i]+" ");
		}
		
	}
}