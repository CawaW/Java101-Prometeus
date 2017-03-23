package com.tasks3.carddeck;

class Deck {
	private int size = 36;
	private Card[] deck = new Card[36];

	public Deck(){
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				deck[i*9+j] = new Card(Rank.values[j],Suit.values[i]);
			}
		}
		this.size = size;
	}

	public Card getCard(int index){ //temporary
		return deck[index];
	}

	public int getSize(){ // temporary
		return this.size;
	}
	public void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int a = (int)(Math.random() * 36);
			int b = (int)(Math.random() * 36);
			if (a != b) {
				Card tmp;
				tmp = deck[a];
				deck[a] = deck[b];
				deck[b] = tmp;
			}
		}
	}
	public void order() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				deck[i*9+j] = new Card(Rank.values[j],Suit.values[i]);
			}
		}
	}

	public boolean hasNext() {
		return size > 0;
	}

	public Card drawOne() {
		Card tmp;
		if (size > 0) {
			tmp = deck[size - 1];
			size--;
			return tmp;
		}
		else return null;
	}
}
