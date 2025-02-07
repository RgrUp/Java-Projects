import java.util.Scanner;

 // This Program will find the factors of an Interger
//(smallest factor first and increasing until all factors are listed).
// ex: input of 120 outputs : 2,2,2,3,5
public class FindFactors {
    public static void main(String[] args) {
    
        // create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Call variable for input
        System.out.print("Enter the Number to Factor:");
        int Number = input.nextInt();

        System.out.print("The Smallest Factors of " + Number + ": " );
        int Test1 = Number; {
        while ( Test1 % 2 ==0 ) {

                Test1 = Test1 / 2 ;
                if (Test1 > 1)
                System.out.print("2, ");
            else
                System.out.print(" 2.");
            }  
        }
        while (Test1 % 3 ==0 ) {
            Test1 = Test1 / 3;
            if (Test1 > 1)
                System.out.print("3, ");
            else
                System.out.print("3.");
        }
        while (Test1 % 5 ==0 ) {
            Test1 = Test1 / 5;
            if (Test1 > 1)
                System.out.print("5, ");
            else
                System.out.print("5.");
        }
        while (Test1 % 7 ==0 ) {
            Test1 = Test1 / 7;
            if (Test1 > 1)
                System.out.print("7, ");
            else
                System.out.print("7.");
        }
        while (Test1 % 11 ==0 ) {
            Test1 = Test1 / 11;
            if (Test1 > 1)
                System.out.print("11, ");
            else
                System.out.print("11.");
        }
        while (Test1 % 13 ==0 ) {
            Test1 = Test1 / 13;
            if (Test1 > 1)
                System.out.print("13, ");
            else
                System.out.print("13.");
        }
        if (Test1 > 1)
            System.out.print(" " + Test1 + ".");
    }
}