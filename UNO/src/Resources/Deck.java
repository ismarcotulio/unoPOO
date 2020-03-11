package Resources;

import java.util.List;
import java.util.ArrayList;

public class Deck {
	
	private List<Cards> cards;
	
	public Deck() {
		this.cards = new ArrayList<Cards>();
	}
	
	public void deal() {
		
	}
	
	public void setCard(Cards card) {
		this.cards.add(card);
	}
	
	public List<Cards> getCards() {
		return this.cards;
	}

}
