import java.util.Scanner;

 // This Program will find the factors of an Interger
//(smallest factor first and increasing until all factors are listed).
// ex: input of 120 outputs : 2,2,2,3,5
public class DuntonFindFactors {
    public static void main(String[] args) {
    
        // create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Call variable for input
        System.out.print("Enter the Number to Factor:");
        int Number = input.nextInt();

        // Preemptive print of output before calculations are done.
        System.out.print("The Smallest Factors of " + Number + ": " );
        // Using While loops to detect if the Number is divisible
        // by 2,3,5,7,11,13.
        int Test1 = Number; {
        while ( Test1 % 2 ==0 ) {
                Test1 = Test1 / 2 ;
        // differentiate the output of the loop cycle w/ If Else Statments
                if (Test1 > 1)
                System.out.print("2, ");
            else
                System.out.print(" 2.");
            }  
        }
        while (Test1 % 3 ==0 ) {
            Test1 = Test1 / 3;
        // differentiate the output of the loop cycle w/ If Else Statments
            if (Test1 > 1)
                System.out.print("3, ");
            else
                System.out.print("3.");
        }
        while (Test1 % 5 ==0 ) {
            Test1 = Test1 / 5;
        // differentiate the output of the loop cycle w/ If Else Statments
            if (Test1 > 1)
                System.out.print("5, ");
            else
                System.out.print("5.");
        }
        while (Test1 % 7 ==0 ) {
            Test1 = Test1 / 7;
        // differentiate the output of the loop cycle w/ If Else Statments
            if (Test1 > 1)
                System.out.print("7, ");
            else
                System.out.print("7.");
        }
        while (Test1 % 11 ==0 ) {
            Test1 = Test1 / 11;
        // differentiate the output of the loop cycle w/ If Else Statments
            if (Test1 > 1)
                System.out.print("11, ");
            else
                System.out.print("11.");
        }
        while (Test1 % 13 ==0 ) {
            Test1 = Test1 / 13;
        // differentiate the output of the loop cycle w/ If Else Statments
            if (Test1 > 1)
                System.out.print("13, ");
            else
                System.out.print("13.");
        }
        // Check if the remaining value in Test1 < 1 and if True Print Value to screen.
        if (Test1 > 1)
            System.out.print(" " + Test1 + ".");
    // Close the input
    input.close();
    }
}