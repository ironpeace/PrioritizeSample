package ironpeace;

public class Model {

	private String text;
	private double number;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	
	public Model(String text, double number){
		this.text = text;
		this.number = number;
	}
	
	
	
}
