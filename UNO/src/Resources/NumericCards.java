package Resources;

public class NumericCards extends Cards{

	public NumericCards(Integer value, Integer color, String img, String type) {
		this.value = value;
		this.color = color;
		this.img = img;
		this.type = type;
	}
	
	public NumericCards(Integer value, Integer color) {
		this.value = value;
		this.color = color;
	}
}
