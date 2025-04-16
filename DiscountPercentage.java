import java.util.Scanner;
public class DiscountPercentage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the fee");
		double fee = input.nextDouble();
		System.out.println("enter the discount percentage");
		double discountPercentage = input.nextDouble();
		double DiscountAmount = fee*(discountPercentage/100);
		double finalFee = fee - DiscountAmount;
		
		System.out.println("the discount amount is " + DiscountAmount + " and the final discounted fee is " + finalFee);
	}
}
		