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
	

}
