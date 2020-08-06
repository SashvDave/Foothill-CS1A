
public class reverse {

public static void main(String[] args) {          
 
char[] letters = {'V', 'H', 'S', 'A', 'S'};
printReverse(letters, 0);

}

public static void printReverse(char[] letters, int size) {
    
for (int i = letters.length-1; i >= 0 ; i--){
System.out.print(letters[i]);
}
}
 
}