package kr.hs.hcinfo;

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is CardGame----");
		ValuedCard card1 = new ValuedCard("A", 1, 15);
		ValuedCard card2 = new ValuedCard("B", 8, 30);
		if(card1.compareTo(card2)>0){
			System.out.println(card1+" Win!!");
		}else{
			System.out.println(card2+" Win!!");
		}
	
		
	}

}
