import java.util.Random;
public class Dunton_Lab_3_4 {
    
    public static void main(String[] args) {
        // Create a Random generator object
        Random random = new Random();

        // Generate a random integer between 1 and 12
        int monthNumber = random.nextInt(12) + 1;

        // Get the corresponding month name
        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
        }

        // Display the month name
        System.out.println("Random Month Generated is -> " + monthName);
    }
}
