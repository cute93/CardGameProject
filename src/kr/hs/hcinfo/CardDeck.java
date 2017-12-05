package kr.hs.hcinfo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
	private ArrayList<ImageCard> deck;
	public CardDeck(){
		deck = new ArrayList<ImageCard>();
	}
	public CardDeck(String shapes[], int nums[]){
		deck = new ArrayList<ImageCard>();
		int v = 0;
		String ipos = "";
		ImageCard inCard = null;
		for(int n:nums){
			for(String s:shapes){
				v++;
				ipos = ImageCard.baseURL+v+".png";
				inCard = new ImageCard(s, n, v, ipos);
				deck.add(inCard);
			}
		}
	}
	public boolean add(ImageCard card){
		return deck.add(card);
	}
	public void add(int index, ImageCard card){
		deck.add(index, card);
	}
	public void clear(){
		deck.clear();
	}
	public ImageCard get(int index){
		return deck.get(index);
	}
	public boolean isEmpty(){
		return deck.isEmpty();
	}
	public ImageCard remove(int index){
		return deck.remove(index);
	}
	public int size(){
		return deck.size();
	}
	public void sort(){
		Collections.sort(deck);
	}
	public void shuffle(){
		Collections.shuffle(deck);
	}
	public ImageCard deal(){
		return deck.remove(0);
	}
	public void showAll(){
		for(ImageCard c:deck){
			c.show();
		}
	}
	
	
}
