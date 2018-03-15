import java.util.ArrayList;

public class Deck 
{
	private ArrayList<Card> unDealt = new ArrayList<Card>();
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	
	public Deck (String[] rank, String[] suit, int[] value)
	{
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				unDealt.add(new Card(rank[i], suit[j], value[i]));
			}
		}
	}
	
	public boolean isEmpty()
	{
		if (unDealt.size() == 0)
		{
			return true;
		}
		
		return false;
	}
	
	public int size()
	{
		return this.unDealt.size();
	}
	
	public String deal()
	{
		Card c = this.unDealt.remove(0);
		this.Dealt.add(c);
		return c.toString();
	}
	
	public void shuffle()
	{
		int posmax = 0;
		int n = this.unDealt.size();
		
		for (int k = 51; k >= 1; k--)
		{
			int r = (int)(Math.random()*50) + 1;
			
			this.unDealt.add(r, this.unDealt.get(k));
			this.unDealt.add(k + 1, this.unDealt.get(r + 1));
			this.unDealt.remove(r + 1);
			this.unDealt.remove(k + 1);
		}
		
		for (int i = 0; i < n; i++)
		{	
			if (this.unDealt.get(i).getValue() > this.unDealt.get(posmax).getValue() && unDealt.get(i).getSuit().trim().toLowerCase().equals("spade"));
			{
				posmax = i;
			}
		}
		
		for (int k = 51; k >= 1; k--)
		{
			this.unDealt.add(posmax, this.unDealt.get(k));
			this.unDealt.add(k + 1, this.unDealt.get(posmax + 1));
			this.unDealt.remove(posmax + 1);
			this.unDealt.remove(k + 1);
			posmax = k;
		}
	}
}
