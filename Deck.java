import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	//private List<Card> cards;
	private Card[]cards;
	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Card[]deckarray = new Card[0];
	for(int i=0;i<ranks.length;i++)
	{
		for(int j=0;j<suits.length;j++)
		{
				Card deck = new Card(ranks[i], suits[j], values[i]);
				deckarray = setnewarray(deck, deckarray);

		}
	}
	
	cards = deckarray;
	shuffle();
	
	
		
	
		
	}
	public Card[] setnewarray(Card otherCard, Card[] oldarray)
	{
		Card[] newarray = new Card[oldarray.length + 1];
		for(int i=0;i<oldarray.length;i++)
		{
			newarray[i] = oldarray[i];
		}
		newarray[oldarray.length] = otherCard;
		return newarray;
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (cards.length == 0)
			return true;
		else
			return false;
		
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */ 
		Card[]shuffled = new Card[51];
		int[] alreadydone= new int[51];
		int j=0;
		boolean cont = true;
		for(int k=0;k<51;k++)
		{
		
		while(checkifinlist(alreadydone,j))
		{
			j = (int)(Math.random()*52);
		}
			alreadydone[k] = j;
			
			System.out.println(k);
			System.out.println(j);
			shuffled[k] = cards[j];
		}
		cards = shuffled;
	}
	
	public boolean checkifinlist(int[] list, int value)
	{
		for(int i=0;i<list.length;i++)
		{
			if(value == list[i])
				return true;
		}
		return false;
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//deal method works, ignore the error (it returns a card..)
		
		while(size!=0)
		{
			size--;
			return cards[size - 1];
		}
		
		return cards[0];
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
