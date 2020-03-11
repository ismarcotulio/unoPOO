package Resources;

public class Player {
	
	private String name;
	private Deck deck;
	private Float score;
	
	public Player(String name ,Deck deck,Float score) {
		this.name = name;
		this.deck = deck;
		this.score = score;
	}
	
	public Player(String name ,Deck deck) {
		this.name = name;
		this.deck = deck;
	}
	
	public Player(String name) {
		this.name = name;
		this.deck = new Deck();
	}
	
	public void pull() {
		
	}
	
	public void push() {
		
	}		
	
}
