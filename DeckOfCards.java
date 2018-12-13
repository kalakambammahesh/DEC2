package com.pre;

public class DeckOfCards {

	public static void main(String[] args) {
		int[] deck = new int[52];//declaring a deck
		String[] suits = {"Spades", "Hears", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen","King"};
		
		int deck_len = deck.length;
		//initiliaze the Deck
		for(int i = 0;i < deck_len;i++) {
			deck[i] = i;
		}
		
		//shuffle the deck
		for(int i = 0;i < deck_len;i++) {
			int pois = (int)(Math.random() * deck_len);
			
			//swap ith element to random position
			int temp = deck[i];
			deck[i] = deck[pois];
			deck[pois] = temp;
		}
		
		//Show the cards
		
		for(int i = 0;i < deck_len;i++) {
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];
			System.out.println("suit:" + suit + " rank:" + rank);
		}
	}

}
