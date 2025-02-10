import java.util.Arrays;
import java.util.Scanner;

public class  DuntonLab5_2 {

    public static void displaySortedNumbers(double[] numbers) {
          Arrays.sort(numbers);
          System.out.println("Sorted Numbers: " + Arrays.toString(numbers)); 
            }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        double[] numbers = new double[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt(); // Read an integer from the user and store it in the array
        }
        System.out.println("Original Numbers: " + Arrays.toString(numbers));
        // Call method to sort and display numbers
        displaySortedNumbers(numbers);

        input.close();
    }
}