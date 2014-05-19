package com.blackjack.bean;

import java.util.ArrayList;
import java.util.List;


public class Hand {
	private List<Card> playerHand;
	
	/**
	 * The number of cards in the first hand
	 */
	
	 public final static int INITIAL_HAND_SIZE = 2;
	
	 /** 
	 * Creates a hand with Card c1 and Card c2
	 * 
	 * @param card1 - The first Card to be added to the Hand
	 * @param card2 - The second Card to be added to the Hand
	 */
	public Hand(Card card1, Card card2) {
		this.playerHand = new ArrayList<Card>();
		this.playerHand.add(card1);
		this.playerHand.add(card2);
	}
	
}
