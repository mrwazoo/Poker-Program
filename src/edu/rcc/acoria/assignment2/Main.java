package edu.rcc.acoria.assignment2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card("Diamond", "2");
		CardDeck d = CardDeck.getStandardDeck();
		d.shuffle();
		ArrayList<Card> cards1 = new ArrayList<Card>();
		ArrayList<Card> cards2 = new ArrayList<Card>();
		
		for (int i = 0; i < 5; ++i) {
			cards1.add(d.deal());
			cards2.add(d.deal());
		}
		Hand hand1 = new Hand(cards1);
		Hand hand2 = new Hand(cards2);
		//System.out.println(hand1);
		//System.out.println(hand2);
		System.out.println(hand1.compareTo(hand2));
		

	}

}
