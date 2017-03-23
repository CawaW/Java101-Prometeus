package com.tasks3.carddeck;

public class TestCardDeck {
	public static void main(String[] args) {
		Deck myDeck = new Deck();
		myDeck.shuffle();
		printDeck(myDeck);
		System.out.println("-------------------------------------------------");
		myDeck.order();
		for (int i = 0; i < 36; i++) {
			Card c = myDeck.drawOne();
			System.out.println("removed: " + c.getSuit().getName() + " " + c.getRank().getName() +
					"\tHas next = " + myDeck.hasNext());
		}
		System.out.println(myDeck.drawOne() + "  Has next = " + myDeck.hasNext());
		printDeck(myDeck);
	}

	public static void printDeck(Deck d){
		for (int i = 0; i < d.getSize(); i++) {
			System.out.println(d.getCard(i).getSuit().getName() + " " + d.getCard(i).getRank().getName());
		}
	}
}
