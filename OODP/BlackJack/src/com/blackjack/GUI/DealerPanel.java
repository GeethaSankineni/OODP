package com.blackjack.GUI;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.blackjack.bean.Card;
import com.blackjack.bean.Hand;

public class DealerPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private Hand hand;

	public DealerPanel(int minBet, Image cardImages) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Clears the hand and returns it in an ArrayList
	 * 
	 * @return ArrayList containing the cleared hand
	 */
	public ArrayList<Card> clearHand() {
		return hand.clearHand();
	}

	/**
	 * Returns the hand of the dealer, probably for comparison purposes.
	 * 
	 * @return dealers hand
	 */
	public Hand getHand() {
		return hand;
	}
}
