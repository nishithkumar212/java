package oops;

import java.util.LinkedList;

public class deckofcardsusingqueue {
	
	public static void main(String[] args) {
			String[] suits= {"clubs","diamonds","hearts","spades"};
			String[] rank= {"2","3","4","5","6","7","8","9","10","jack","king","queen","ace"};
					LinkedList[] cards = new LinkedList[52];
			for (int i = 0; i < cards.length; i++)
			{
				cards[i] = new LinkedList();
			}
			int index=0;
			for (int i = 0; i < suits.length; i++) 
			{
				for (int j = 0; j < rank.length; j++) 
				{
					cards[index++].add(rank[j] + " " + suits[i]);
				}
			}
			
	}

}
