import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the year which you would like to test");
        int year = sc.nextInt();  // Read user input
        if (((year % 4) == 0) && (!(year % 100 == 0))) {
            System.out.println ("This is a leap year");
        }
        else if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println ("This is not a leap year");
        }
    }
}

