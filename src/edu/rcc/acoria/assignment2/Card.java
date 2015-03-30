package edu.rcc.acoria.assignment2;

public class Card {
	private String suit;
	private String face;
	
	public Card(String suit, String face) {
		super();
		this.suit = suit;
		this.face = face;
	}
	public String getSuit() {
		return suit;
	}
	public String getFace() {
		return face;
	}
	public boolean isSameSuit(Card c) {
		return this.suit.equals(c.getSuit());
	}
	
	public boolean isSameFace(Card c) {
		return this.face.equals(c.getFace());
	}
	
	public int getNumericalValue() {
		if (face.equals("A")){
			return 14;
		} else if (face.equals("K")){
			return 13;
		} else if (face.equals("Q")){
			return 12;
		} else if (face.equals("J")) {
			return 11;
		} else {
			return Integer.parseInt(face);
		}
	}
	
	public String toString() {
		return face + " of " + suit;
	}
	

}
