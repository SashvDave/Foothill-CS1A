import java.util.Scanner;
public class GCD {
    static int GCD = 1;
    static void computeGcd(int firstNumber, int SecondNumber) {
        for (int i = 1; i <= firstNumber && i <= SecondNumber; i++) {
            if ((firstNumber % i == 0) && (SecondNumber % i == 0) && (i != 1)) {
                GCD = i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is the first of two numbers you'd like to test?");
        int firstNumber = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("What is the second number which you would like to test?");
        int secondNumber = sc2.nextInt();
        computeGcd(firstNumber, secondNumber);
        System.out.println("GCD is " + GCD);
    }
}


