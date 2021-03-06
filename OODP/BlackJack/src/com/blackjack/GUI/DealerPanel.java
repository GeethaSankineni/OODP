package com.blackjack.GUI;

import java.awt.*;
import java.util.ArrayList;

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
	 * Flips the second card in the hand
	 */
	public void flipSecond() {
		hand.get(1).flip();
		repaint();
	}
	
	/**
	 * Paints the cards stacked top-down in addition to the rest of the
	 * components. The cards are arranged so the user can still see all of the
	 * cards' values.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (hand == null)
			return;
		for (int i = 0; i < hand.length(); i++) {
			drawCard(g, hand.get(i), 10, 80 + 33 * i);
		}
	}

	/**
	 * Paints a card image onto (x,y) of the container. A face down card will be
	 * drawn accordingly.
	 * 
	 * @param g 	- the graphics context
	 * @param card  - the card to be printed
	 * @param x 	- the x-position of the printed card in this container
	 * @param y		- the y-position of the printed card in this container
	 */
	private void drawCard(Graphics g, Card card, int x, int y) {
		int cx; // top-left x of cardsImage
		int cy; // top-left y of cardsImage
		if (!card.isFaceUp()) {
			cx = 2 * 79;
			cy = 4 * 123;
		} else {
			cx = (card.getFace()-1) * 79;
			switch (card.getSuit()) {
			case Card.DIAMONDS:
				cy = 123;
				break;
			case Card.CLUBS:
				cy = 0;
				break;
			case Card.HEARTS:
				cy = 2 * 123;
				break;
			default:
				cy = 3 * 123;
				break; // Spades
			}
		}
		g.drawImage(cardImgs, x, y, x + 79, y + 123, cx, cy, cx + 79, cy + 123,this);
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
