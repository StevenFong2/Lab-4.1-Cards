//StevenFong
//Period 2

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
	
	public Card deal()
	{
		Card c = this.unDealt.remove(0);
		this.Dealt.add(c);
		return c;
	}
	
	public void shuffle()
	{
		int posmax = 0;
		int n = this.unDealt.size();
		
		for (int k = n - 1; k >= 0; k--)
		{
			int r = (int)(Math.random()*(n - 1));
			
			Card c = unDealt.get(k);
			
			this.unDealt.set(k, unDealt.get(r));
			this.unDealt.set(r, c);
			
			/*this.unDealt.add(r, this.unDealt.get(k));
			this.unDealt.add(k + 1, this.unDealt.get(r + 1));
			this.unDealt.remove(r + 1);
			this.unDealt.remove(k + 1);*/
		}
		
		for (int k = n - 1; k >= 0; k--)
		{
			for (int i = 0; i < n; i++)
			{	
				if (this.unDealt.get(i).getValue() >= this.unDealt.get(posmax).getValue());
				{
					posmax = i;
				}
			}
			
			Card c = unDealt.get(k);
			
			this.unDealt.set(k, unDealt.get(posmax));
			this.unDealt.set(posmax, c);
			
			/*this.unDealt.add(posmax, this.unDealt.get(k));
			this.unDealt.add(k + 1, this.unDealt.get(posmax + 1));
			this.unDealt.remove(posmax + 1);
			this.unDealt.remove(k + 1);*/
		}
	}
	
	/*public String numberRepeats()
	{
		//int n = unDealt.size();
		int n = Dealt.size();
		int rep = 0;
		
		for (int i = 0; i < n - 1; i++)
		{
			if (Dealt.get(i).toString().equals(Dealt.get(i + 1).toString()))
			{
				rep++;
			}
		}
		
		if (rep > 0)
		{
			return "There are duplicate cards";
		}
		
		return "There are no duplicate cards";
	}*/
}
