import java.util.Scanner;
public class MidtermPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you would like to convert");
        char num = sc.next().charAt(0);
        int converted = Character.getNumericValue(num);
        System.out.println(converted);
    }
}
