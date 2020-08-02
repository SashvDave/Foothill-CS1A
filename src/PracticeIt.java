public class PracticeIt {
    public static int mystery5(int x, int y) {
        if (x < 0) {
            return -mystery5(-x, y);
        } else if (y < 0) {
            return -mystery5(x, -y);
        } else if (x == 0 && y == 0) {
            return 0;
        } else {
            return 100 * mystery5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
        }
    }
    public static void main(String[] args) {
        
        mystery5(5, 7);  		
    
    }
}



// mystery5(5, 7)	
// mystery5(12, 9)	
// mystery5(-7, 4)	
// mystery5(-23, -48)	
// mystery5(128, 343)

