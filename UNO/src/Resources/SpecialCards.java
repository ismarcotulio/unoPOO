package Resources;

public class SpecialCards extends Cards{
	
	public SpecialCards(Integer value, Integer color, String img, String type) {
		this.value = value;
		this.color = color;
		this.img = img;
		this.type = type;
	}
	
	public SpecialCards(Integer value, Integer color) {
		this.value = value;
		this.color = color;
	}
	
	public void action() {
		
	}
}
