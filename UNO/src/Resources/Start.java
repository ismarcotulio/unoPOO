package Resources;

import unoDeck.PlayerManager;

public class Start {
	
	private Deck principalDeck;
	private Deck currentDeck;
	private PlayerManager pm;
	private Player player1;
	private Player player2;
	

	public Start(Player player1, Player player2) {
		this.principalDeck = new Deck();
		this.currentDeck = new Deck();
		this.pm = new PlayerManager();
		//this.pm.addPlayer(player1);
		this.player1 = player1;
		this.player2 = player2;
		
		createCards(0,0);
	}
	
	public void createCards(Integer codeCard, Integer colorCard) {
		if(codeCard >= 10) {
			if(codeCard >= 13) {
				if(codeCard > 14) {
					
				}else {
					if(colorCard > 3) {
						createCards(codeCard + 1, 0);
					}else {
						SpecialCards specialCard3 = new SpecialCards(codeCard, 4);
						this.principalDeck.setCard(specialCard3);
						System.out.print(String.format("codigo %s color %s",codeCard,colorCard));
						createCards(codeCard, colorCard + 1);
					}
				}
			}else {
				if(colorCard > 3) {
					createCards(codeCard + 1, 0);
				}else {
					SpecialCards specialCard1 = new SpecialCards(codeCard, colorCard);
					SpecialCards specialCard2 = new SpecialCards(codeCard, colorCard);
					this.principalDeck.setCard(specialCard1);
					this.principalDeck.setCard(specialCard2);
					System.out.print(String.format("codigo %s color %s",codeCard,colorCard));
					createCards(codeCard, colorCard + 1);
				}
			}
			
		}else {
			if(colorCard > 3) {
				createCards(codeCard + 1, 0);
			}else {
				NumericCards card1 = new NumericCards(codeCard, colorCard);
				NumericCards card2 = new NumericCards(codeCard, colorCard);
				this.principalDeck.setCard(card1);
				this.principalDeck.setCard(card2);
				System.out.print(String.format(" codigo=%s color=%s",codeCard,colorCard));
				createCards(codeCard, colorCard + 1);
			}
		}
	}
	
	public Deck getPrincipalDeck() {
		return this.principalDeck;
	}
}
