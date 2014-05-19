package com.blackjack.bean;


import java.util.ArrayList;
import java.util.List;


import com.blackjack.GUI.BlackJackUtil;

public class Deck {
private List<Card> deck;
	
	
public Deck() {
		
		this.deck = new ArrayList<Card>();
		for (int i = 0; i < BlackJackUtil.NUM_DECKS; i++) {
			for (int j = 0; j < BlackJackUtil.SUITS_IN_DECK; j++) {
				for (int k = 1; k <= BlackJackUtil.FACES_IN_DECK; k++) {
					this.deck.add(new Card(j, k));
				}
			}
		}
		shuffle();
	}
	/**
	 * Shuffles the deck
	 */

public void shuffle() {

}
}