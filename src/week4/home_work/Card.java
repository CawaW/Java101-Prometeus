package week4.home_work;

class Card {
	private Rank r;
	private Suit s;

	public Card(Rank rank, Suit suit) {
		this.r = rank;
		this.s = suit;
	}

	public Rank getRank() {
		return r;
	}

	public void setRank(Rank rank) {
		this.r = rank;
	}

	public Suit getSuit() {
		return s;
	}

	public void setSuit(Suit suit) {
		this.s = suit;
	}
}
