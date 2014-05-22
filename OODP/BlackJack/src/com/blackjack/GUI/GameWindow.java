package com.blackjack.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.blackjack.bean.Card;
import com.blackjack.bean.Deck;
import com.blackjack.bean.Hand;


/**
 * Contains GUI components.
 * 
 */
	public class GameWindow extends JFrame implements ActionListener {

		
		
		private DealerPanel dealer;
		
		private PlayerPanel humanPlayer;
		
		private ChoicePanel playerChoices;
		
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
		}


		@Override
		public void actionPerformed(ActionEvent arg0) {
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
}
