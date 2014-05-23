package com.blackjack.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.blackjack.bean.Card;
import com.blackjack.bean.Deck;
import com.blackjack.bean.Hand;


/**
 * Contains GUI components.
 * 
 */
	public class GameWindow extends JFrame implements ActionListener {

		
		
		private static final long serialVersionUID = 1L;
		
		private DealerPanel dealer;
		
		private PlayerPanel humanPlayer;
		
		//private ChoicePanel playerChoices;
		
		private Deck deck;
		
		private boolean turnContinue;
		private Image cardImages;	

		/**
		 * Opens window containing Blackjack game.
		 */
		public GameWindow() {
			
			super(BlackJackUtil.WINDOW_HEADING);
			getContentPane().setBackground(new Color(80, 135, 85));

			//This will load the main card image into  cardImages variable
			loadImages();
			
			//Creates player and dealer panels 
			initComponents();
			
			pack();
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}
	

		/**
		 * Adds components to the frame.
		 */
		private void initComponents() {
			
			
		}

			
		
         private void loadImages() {
		
				ClassLoader cl = GameWindow.class.getClassLoader();
				URL imageURL = cl.getResource("cards.png");
				if (imageURL != null){
					this.cardImages = Toolkit.getDefaultToolkit().createImage(imageURL);
				} else {
					String errorMsg = "Card image file loading failed.";
					JOptionPane.showMessageDialog(this, errorMsg, "Error",JOptionPane.ERROR_MESSAGE);
					System.exit(1);
				}
			}

		
		/**
		 * Responds to button presses from the ChoicePanel.
		 * 
		 * @param a
		 *            The event that will be responded to
		 */

		@Override
		public void actionPerformed(ActionEvent a) {
		
			// TODO Auto-generated method stub
			String command = a.getActionCommand();
			if (command.equals("Hit")) {
				giveCard(humanPlayer);
				boolean busted = humanPlayer.getHand().isBusted();
				setTurnContinue(!busted);
			} else if (command.equals("Stand")) {
				setTurnContinue(false);
			}
		}
		/**
		 * Deals cards to the player
		 * 
		 * @param player
		 *            The player to deal cards to
		 */
		private void dealCards(PlayerPanel player) {
			Card c1 = deck.draw();
			Card c2 = deck.draw();
			player.startHand(c1, c2);
		}
		/**
		 * Collects cards from the dealer
		 */
		
		private void collectDealerCards() {
			ArrayList<Card> collectedCards = dealer.clearHand();
			for (Card card : collectedCards) {
				this.deck.addToBottom(card);
			}
		}


		private void giveCard(PlayerPanel humanPlayer2) {
			// TODO Auto-generated method stub
			
		}


		public void askBets() {
			// TODO Auto-generated method stub
			
		}


		public void deal() {
			// TODO Auto-generated method stub
			
		}


		public void setButtonState(boolean b, boolean c) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * @return the cardImages
		 */
		public Image getCardImages() {
			return cardImages;
		}

		/**
		 * @param cardImages the cardImages to set
		 */
		public void setCardImages(Image cardImages) {
			this.cardImages = cardImages;
		}
		/**
		 * @return the humanPlayer
		 */
		public PlayerPanel getHumanPlayer() {
			return humanPlayer;
		}

		/**
		 * @param humanPlayer the humanPlayer to set
		 */
		public void setHumanPlayer(PlayerPanel humanPlayer) {
			this.humanPlayer = humanPlayer;
		}
		
		/**
		 * @param turnContinue the turnContinue to set
		 */
			
			public void setTurnContinue(boolean turnContinue) {
				this.turnContinue = turnContinue;
			}


		public boolean isTurnContinue() {
			// TODO Auto-generated method stub
			return false;
		}


		public void doDealerTurn() {
			// TODO Auto-generated method stub
			
		}


		public void doPayOuts() {
			// TODO Auto-generated method stub
			
		}


		public void reset() {
			// TODO Auto-generated method stub
			
		}
			
		

}