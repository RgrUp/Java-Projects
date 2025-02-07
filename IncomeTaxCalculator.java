import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for filing status
        System.out.print("Enter the filing status:");
        int status = input.nextInt();

        // Validate filing status
        if (status < 0 || status > 3) {
            System.out.println("Invalid filing status.");
            return;
        }

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Compute tax
        double tax = computeTax(status, income);

        // Display result
        System.out.printf("tax is: $%.2f\n", tax);
    }

    public static double computeTax(int status, double income) {
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single
            {16700, 67900, 137050, 208850, 372950}, // Married Filing Jointly
            {8350, 33950, 68525, 104425, 186475}, // Married Filing Separately
            {11950, 45500, 117450, 190200, 372950}  // Head of Household
        };

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        
        double tax = 0;
        int[] bracket = brackets[status];

        if (income <= bracket[0]) {
            return income * rates[0];
        }

        tax += bracket[0] * rates[0];
        for (int i = 1; i < bracket.length; i++) {
            if (income > bracket[i]) {
                tax += (bracket[i] - bracket[i - 1]) * rates[i];
            } else {
                tax += (income - bracket[i - 1]) * rates[i];
                return tax;
            }
        }

        tax += (income - bracket[bracket.length - 1]) * rates[rates.length - 1];
        return tax;
    }
}
