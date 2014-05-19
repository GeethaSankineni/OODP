package com.blackjack.bean;


import java.util.ArrayList;
import java.util.List;


import java.util.Random;

import com.blackjack.GUI.BlackJackUtil;

public class Deck {
private List<Card> deck;
	
private int numCardsRemaining;
private int count;
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
		ArrayList<Card> tempDeck = new ArrayList<Card>();
		Random random = new Random();
		while (this.deck.size() > 0) {
			int cardToRemove = random.nextInt(this.deck.size());
			Card tempCard = this.deck.get(cardToRemove);
			this.deck.remove(cardToRemove);
			tempDeck.add(tempCard);
		}
		while (tempDeck.size() > 0) {
			Card tempCard = tempDeck.get(0);
			tempDeck.remove(0);
			this.deck.add(tempCard);
		}
		count = 0;
		numCardsRemaining = BlackJackUtil.NUM_DECKS * BlackJackUtil.CARDS_IN_DECK;
	}


}