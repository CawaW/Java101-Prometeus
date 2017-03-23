package week4.home_work;

public class TestDeck {
	public static void main(String[] args) {
		Deck myDeck = new Deck();
		myDeck.shuffle();
		printDeck(myDeck);
		System.out.println("-------------------------------------------------");
		myDeck.order();
		for (int i = 0; i < 36; i++) {
			Card c = myDeck.drawOne();
			System.out.println("removed: " + c.getSuit() + " " + c.getRank() +
					"\tHas next = " + myDeck.hasNext());
		}
		System.out.println(myDeck.drawOne() + "  Has next = " + myDeck.hasNext());
		printDeck(myDeck);
	}

	public static void printDeck(Deck d){
		for (int i = 0; i < d.getSize(); i++) {
			System.out.println(d.getCard(i).getSuit() + " " + d.getCard(i).getRank());
		}
	}
}
