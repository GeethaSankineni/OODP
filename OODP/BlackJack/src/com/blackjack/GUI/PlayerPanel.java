package com.blackjack.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.blackjack.bean.Card;
import com.blackjack.bean.Hand;


/**
	 * A container that shows a player's name, remaining cash, and his hand. It also
	 * contains fields for its current bet, the minimum bet, and the card image file.
	 * The player can be called upon to do bets, insurance, a game action (for computers),
	 * receive money/winnings, and clear his hand.
	 */
	public class PlayerPanel extends JPanel {

		private static final long serialVersionUID = 1L;
		
		private String name;
		private boolean isHuman;
		
		private int money;
		private int bet;
		private int minBet;
		
		private Hand hand;
		private Image cardImgs;

		private JLabel moneyDisp;
		private JLabel betDisp;

		private int previousOutcome = 0;

		/**
		 * Creates a panel displaying the player's name, his remaining money, and
		 * his current bet, as well as his hand.
		 * 
		 * @param pName
		 *            Name of the player
		 * @param isHumanPlayer
		 *            is the player a human or a computer
		 * @param startMoney
		 *            the starting amount of money player has
		 * @param minimumBet
		 *            the minimum the player is allowed to bet
		 * @param cardImages
		 *            the card images file
		 */
		public PlayerPanel(String playerName, boolean isHumanPlayer, int startMoney,int minimumBet, Image cardImages) {
			
			super();
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			setPreferredSize(new Dimension(99, 325));
			setOpaque(false);	
			
			Color c = Color.DARK_GRAY;		
			if (isHumanPlayer)
				c = Color.LIGHT_GRAY;
			
			setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(c), name));
			
			this.name = playerName;
			this.isHuman = isHumanPlayer;
			this.money = startMoney;
			this.bet = 0;
			this.minBet = minimumBet;
			this.hand = null;
			this.cardImgs = cardImages;
			
			moneyDisp = new JLabel("$" + Integer.toString(money));
			moneyDisp.setForeground(new Color(87, 233, 100));
			moneyDisp.setFont(new Font(Font.SERIF, Font.PLAIN, 14));
			
			betDisp = new JLabel("$" + Integer.toString(0));
			betDisp.setForeground(Color.RED);
			betDisp.setFont(new Font(Font.SERIF, Font.PLAIN, 14));

			add(moneyDisp);
			add(betDisp);
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
