/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
        Card One = new Card("3", "Hearts", 3);
        Card Two = new Card("2", "Spades",3);
        Card Three = new Card("3", "Hearts", 3);
        
        System.out.println("Does card one match card two?" + One.matches(Two));
        System.out.println("Does card two match card three?" + Two.matches(Three));    
        System.out.println("Does card one match card three?" + One.matches(Three));
        System.out.println("Card one has suit: " + one.suit());
        System.out.println("Card one is an: " + one.toString());
	}
}
