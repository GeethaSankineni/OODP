package com.blackjack.GUI;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JLabel;

import com.blackjack.bean.Card;
import com.blackjack.bean.Hand;

public class PlayerPanel {
	private Hand hand;
	private int bet;
	private int money;
	private boolean isHuman;
	private int previousOutcome;
	private JLabel moneyDisp;
	private JLabel betDisp;
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

	/**
	 * Gets the current betting amount of player.
	 * 
	 * @return player's current bet
	 */
	public int getCurrentBet() {
		return bet;
	}

	/**
	 * Adds to player's total money amount moneyWon.
	 * 
	 * @param moneyWon
	 *            amount of money to add
	 */
	public void addWinnings(int moneyWon) {
		money = money + moneyWon;
		updateText();

		if (moneyWon > bet) {
			this.previousOutcome = BlackJackUtil.WIN;			
		} else if (moneyWon == bet) {
			this.previousOutcome = BlackJackUtil.PUSH;			
		} else {
			this.previousOutcome = BlackJackUtil.LOSS;		
		}
		
		moneyDisp.setText(moneyDisp.getText() + "  ");
	}

	/**
	 * Updates the displays of player's remaining money and current bet.
	 */
	private void updateText() {
		moneyDisp.setText("$" + Integer.toString(money));
		betDisp.setText("$" + Integer.toString(bet));
	}
	/**
	 * Gets whether the player is a Human
	 * 
	 * @return Boolean representing whether the player is a human
	 */
	public boolean isHuman() {
		return isHuman;
	}

}
