import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        int[] testNums = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favorite number?");
        int firstNum = sc.nextInt();
        testNums[0] = firstNum;
        System.out.println(testNums);
    }   
}