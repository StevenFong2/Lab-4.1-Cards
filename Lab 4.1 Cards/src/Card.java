
public class Card 
{
	private String rank;
	private int value;
	private String suit;
	
	public Card(String rank, String suit, int value)
	{
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}
	
	public String getRank() 
	{
		return rank;
	}

	public String getSuit() 
	{
		return suit;
	}

	public int getValue()
	{
		return value;
	}
	
	public boolean equals(Card othercard)
	{
		if (this.value == othercard.getValue())
		{
			return true;
		}
		
		return false;
	}
	
	public String toString()
	{
		String r = this.rank + " of " + this.suit;
		return r;
	}
}
