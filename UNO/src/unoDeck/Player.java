package unoDeck;

import java.util.List;

public class Player {
	
	private String name;
	private List<Card> deck;
	private Float score;
	
	public Player(String name ,List<Card> deck,Float score) {
		this.setName(name);
		this.setDeck(deck);
		this.setScore(score);
	}
	
	public Player(String name ,List<Card> deck) {
		this.setName(name);
		this.setDeck(deck);
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	
}
