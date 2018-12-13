package com.pre;

class DeckOfCard1{
	
	private Card card;
	
	DeckOfCard1(){
		card = new Card();
		shuffle();
	}
	
	//shuffle the cards
	void shuffle() {
		for (int i = 0;i < 52;i++) {
			int index =(int)( Math.random()*52);
			
			//swap i to index which become random
			int temp = card.deck[i];
			card.deck[i] = card.deck[index];
			card.deck[index] = temp; 
		}
	}
	
	void deal(int n) {
		System.out.println("Random " + n + " Cards");
		
		for(int i = 0;i < 52;i++) {
			//if(i < n) break;
			String suit = card.suits[card.deck[i]/13];
			String rank = card.ranks[card.deck[i]%13];
			System.out.println("Suit: " + suit + " Rank " + rank);
		}
	}
}

class Card{
	int[] deck = new int[52];
	String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
	String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen","King"};
	
	//initilize deck when instance is created for Card Class..
	Card(){
		for(int i = 0;i < 52;i++) {
			deck[i] = i;
		}
	}
}

public class DeckOfCards1 {

	public static void main(String[] args) {
		
		DeckOfCard1 ob = new DeckOfCard1();
		ob.deal(3);
	}

}
