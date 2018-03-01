/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("king","diamonds",13);
		System.out.println(one);
		
		Card two = new Card("king", "diamonds",13);
		System.out.println(one.matches(two));
		System.out.println(two);
		
		Card three = new Card("jack","spades",11);
		System.out.println(three);
		
		
		
	}
}
