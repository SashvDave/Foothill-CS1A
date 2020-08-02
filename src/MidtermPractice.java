import java.util.Scanner;

public class MidtermPractice {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you'd like to print in reverse");
        int num = sc.nextInt(), reversed = 0;

        while(num >= 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
