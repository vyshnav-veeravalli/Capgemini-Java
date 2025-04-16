// Define the class ProfitCalculator 
public class ProfitCalculator {
    public static void main(String[] args) {
        // Define the cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit amount
        double profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Display the results of profit and profit percentage 
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}	