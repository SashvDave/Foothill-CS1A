public class Final {
    public static void reverse(char[] arr) {
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        char[] arr = {'A', 'V', 'A', 'J'}; // Hardcoded, to leave size and such up to user, would need to use arraylist which was not part of question
        reverse(arr);
    }
}