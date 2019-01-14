package oops;
import bridgeit.utility;
public class deckofcards{
public static void main(String[] args) {
		String[] suits= {"clubs","diamonds","hearts","spades"};
		String[] rank= {"2","3","4","5","6","7","8","9","10","jack","king","queen","ace"};
		System.out.println("enter the number of players");
		int players=utility.getint();
		String[][] cards=new String[suits.length][rank.length];
		utility.cards(cards, suits, rank);
		utility.shufflecards(cards, suits, rank);
		utility.printCards(cards);
		}
}
