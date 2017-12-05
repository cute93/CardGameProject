package kr.hs.hcinfo;

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shapes[] = {"C", "H", "D", "S"};
		int nums[] = {2,3,4};
		CardDeck myDeck = new CardDeck(shapes, nums);
		myDeck.showAll();
		myDeck.shuffle();
		myDeck.showAll();
	}

}
