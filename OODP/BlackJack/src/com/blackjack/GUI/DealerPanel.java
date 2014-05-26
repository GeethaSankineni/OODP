package com.blackjack.GUI;

import java.awt.Image;
import java.util.ArrayList;
import java.awt.*;

import javax.swing.*;


import com.blackjack.bean.Card;
import com.blackjack.bean.Hand;


/**
 * A container that represents the Dealer. It has a hand (dealer's hand), the
 * minimum bet he will accept, and the card images file. Similar to PlayerPanel.
 * 
 */
public class DealerPanel extends JPanel {

	private static final long serialVersionUID = 1L;	
	
	private Hand hand;
	
	private Image cardImgs;

	private JLabel minBetDisp;

	/**
	 * Initializes a JPanel name "dealer" displaying the minimum wager. Card
	 * graphics are dealt with automatically by paintComponent(g).
	 * 
	 * @param minimumBet - smallest money wager allowed
	 * @param cardImages - card image map file
	 */
	public DealerPanel(int minimumBet, Image cardImages) {
		super();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // vertical layout
		setPreferredSize(new Dimension(99, 320));
		setOpaque(false);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY), "DEALER"));
		
		
		this.cardImgs = cardImages;
		
		minBetDisp = new JLabel("<HTML><font color=#EDDA74>Minimum Bet: $<u>" + minimumBet + "</u></font></HTML>");
		minBetDisp.setFont(new Font(Font.SERIF, Font.BOLD, 18));
		add(minBetDisp);
	}
	/**
	 * Creates a hand with Card c1 and Card c2
	 * 
	 * @param c1 - First card to be added
	 * @param c2 - Second card to be added
	 */
	public void startHand(Card c1, Card c2) {
		 this.hand = new Hand(c1, c2);
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
