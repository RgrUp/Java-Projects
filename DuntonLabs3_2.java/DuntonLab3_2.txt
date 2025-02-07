import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight and price of the first package
        System.out.print("Enter the weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        // Prompt the user to enter the weight and price of the second package
        System.out.print("Enter the weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        // Calculate the cost per unit for each package
        double costPerUnit1 = price1 / weight1;
        double costPerUnit2 = price2 / weight2;

        // Determine which package has the better price
        if (costPerUnit1 < costPerUnit2) {
            System.out.println("Package 1 has a better price.");
        } else if (costPerUnit1 > costPerUnit2) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Both packages have the same price.");
        }

        // Close the scanner
        input.close();
    }
}