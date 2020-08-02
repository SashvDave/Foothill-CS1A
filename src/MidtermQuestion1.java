import java.util.Scanner;
import java.lang.Math;
public class MidtermQuestion1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("What is the radius of your sphere?");
        double radius = r.nextDouble();
        double radinFormula = Math.pow(radius, 3);
        double Volume = (4.0/3.0) * Math.PI * radinFormula;
        System.out.println("The volume of your sphere is: " + Volume);
    }
}
