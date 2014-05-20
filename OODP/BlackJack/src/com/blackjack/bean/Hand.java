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
	/**
	 * Gets the best(highest) value of the hand
	 * 
	 * @return Integer value of the hand
	 */
	public int getBestValue() {
		int totalValue = 0;
		for (Card card : this.playerHand) {
			if (card.getFace() != Card.ACE) {
				totalValue += card.getValue();
			}
		}
		for (Card card : this.playerHand) {
			if (card.getFace() == Card.ACE) {
				if (totalValue + card.getHighValue() <= 21) {
					totalValue += card.getHighValue();
				} else {
					totalValue += card.getLowValue(); // 1
				}
			}
		}
		return totalValue;
	}
	/**
	 * Tells whether the hand has busted
	 * 
	 * @return boolean representing whether the Hand has busted
	 */
	public boolean isBusted() {
		return getBestValue() > 21;
	}

	}
	
	

