
public class DeckTester 
{
	public static void main(String[] args)
	{
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
		int[] value = {14, 15, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		Deck deck = new Deck(rank, suit, value);
		
		/*for (int i = 0; i < deck.size(); i++)
		{
			System.out.println(deck.toS);
		}*/
	}
}
