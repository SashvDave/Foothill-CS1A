import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int k = 0; k < arr.length; k++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is the number you would like to put in the array?");
            arr[k] = sc.nextInt();
        }
        
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest number in your array was: " + largest);
    }
}