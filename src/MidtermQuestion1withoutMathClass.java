import java.util.Scanner;
public class MidtermQuestion1withoutMathClass {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("What is the radius of your sphere?");
        double radius = r.nextDouble();
        double PI = 3.14; //Can also be referenced within Volume itself
        double Volume = (4.0/3.0) * PI * Math.pow(radius, 3);
        System.out.println("The volume of your sphere is: " + Volume);
    }
}
