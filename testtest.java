import java.util.Scanner;

public class testtest {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input year and month
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        
        // Calculate number of days in the given month
        int daysInMonth;
        switch (month) {
            // January, March, May, July, August, October, December have 31 days
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            // April, June, September, November have 30 days
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            // February needs special handling for leap years
            case 2:
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            // Default case (should not happen with valid input)
            default:
                daysInMonth = 0;
                break;
        }
        
        // Output the result
        System.out.println(daysInMonth);
        
        scanner.close();
    }
    
    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year rules: divisible by 4 but not divisible by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}