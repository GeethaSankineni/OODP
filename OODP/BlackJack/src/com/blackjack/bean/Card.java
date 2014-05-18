package com.blackjack.bean;

public class Card {
	/*
	 * Declare Constants
	 * */
	
	public static final int ACE = 1;
	
	public static final int TWO = 2;
	
	public static final int THREE = 3;
	
	public static final int FOUR = 4;
	
	public static final int FIVE = 5;
	
	public static final int SIX = 6;
	
	public static final int SEVEN = 7;
	
	public static final int EIGHT = 8;
	
	public static final int NINE = 9;
	
	public static final int TEN = 10;
	
	public static final int JACK = 11;
		
	public static final int QUEEN = 12;
	
	public static final int KING = 13;

	public static final int DIAMONDS = 0;
	
	public static final int CLUBS = 1;
	
	public static final int HEARTS = 2;
	
	public static final int SPADES = 3;
	
	/**
	 * suit will contain a value from 0 to 3. Will represent the suits of cards from
	 * smallest suit to largest (Diamond, Club, Heart, Spades)
	 */
	private int suit;
	
	/**
	 * Face will contain a value from 1 to 13, from Ace to King
	 */
	private int face;
	
	private boolean isFaceUp;
	
/*
 * Create Card with 3 attributes
 * */
	
	
	public Card(int suit, int face, boolean faceDir) {
		this.suit = suit;
		this.face = face;
		this.isFaceUp = faceDir;
	}

	/*
	 * Create Card with 2 attributes
	 * */
			
	public Card(int suit, int face) {
		this.suit = suit;
		this.face = face;
		this.isFaceUp = true;
	}
	
	/**
	 * Gets the color of the card
	 * 
	 * @return Color of the card as a String
	 */
	public String getColorName() {
		if (suit == 0 || suit == 2)
			return "Red";
		else
			return "Black";
	}

	/**
	 * Gets the face, or the name, of the Card
	 * 
	 * @return Face of the Card
	 */
	public int getFace() {
		return face;
	}
	/**
	 * Gets the value of the Card Uses the face of the Card to calculate the
	 * value Ace is 1, 2-9 are itself, 10 and higher are 10
	 * 
	 * @return value of the card
	 */
	public int getValue() {
		if (face >= TWO && face < TEN)
			return face;
		else if (face >= TEN)
			return 10;
		return 1;
	}

	/**
	 * Gets the highest value of the card
	 * 
	 * @return integer of the highest possible value of the card
	 */
	public int getHighValue() {
		int high = getValue();
		if (high == 1) {
			return 11;
		} else {
			return high;
		}
	}

	
}
