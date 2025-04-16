public class FeeDiscount {
    public static void main(String[] args) {
        // Define the total fee
        double fee = 125000;

        // Define the discount percentage
        double discountPercent = 10;

        // Calculate discount amount
        double discountAmount = (fee * discountPercent) / 100;

        // Calculate the final amount to be paid
        double finalFee = fee - discountAmount;

        // Display the results
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}