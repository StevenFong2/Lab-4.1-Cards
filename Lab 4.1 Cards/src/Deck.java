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
		return unDealt.size();
	}
	
	public void deal()
	{
		Card c = unDealt.remove(0);
	}
	
	public void shuffle()
	{
		int posmax = 0;
		
		for (int k = 51; k >= 1; k--)
		{
			int r = (int)((Math.random()*50)) + 1;
			Card c = unDealt.remove(r);
			unDealt.add(r, unDealt.get(k));
			unDealt.remove(k);
			unDealt.add(k, c);
		}
		
		for (int i = 0; i < unDealt.size(); i++)
		{	
			if (unDealt.get(i).getValue() > unDealt.get(posmax).getValue() && unDealt.get(i).getSuit().trim().toLowerCase().equals("spade"));
			{
				posmax = i;
			}
		}
		
		for (int k = 51; k >= 1; k--)
		{
			Card c = unDealt.remove(posmax);
			unDealt.add(posmax, unDealt.get(k));
			unDealt.remove(k);
			unDealt.add(k, c);
			posmax = k;
		}
	}
}
