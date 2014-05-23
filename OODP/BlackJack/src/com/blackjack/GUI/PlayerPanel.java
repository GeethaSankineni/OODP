package com.blackjack.GUI;

import java.awt.Image;
import java.util.ArrayList;

import com.blackjack.bean.Card;
import com.blackjack.bean.Hand;

public class PlayerPanel {
	private Hand hand;

	public PlayerPanel(String playerName, boolean b, int startMoney,
			int minBet, Image cardImages) {
		// TODO Auto-generated constructor stub
	}

	public Hand getHand() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * New hand for player with Card c1 and Card c2
	 * 
	 * @param c1
	 *            First Card in Hand
	 * @param c2
	 *            Second Card in Hand
	 */
	public void startHand(Card c1, Card c2) {
		hand = new Hand(c1, c2);
	}
	
	/**
	 * Clears the player's hand and returns it in an ArrayList	 * 
	 * @return ArrayList containing the cleared hand
	 */
	public ArrayList<Card> clearHand() {
		return hand.clearHand();
	}

}
