package local.qa.inheritance;

public class Farmer extends Person {

	private Boolean innovative = true;
	private Boolean environmental = true;
	
	public void goodWithHands() {
		System.out.println("Let me open that jar for you.");
	}
	
	@Override
	public void favPhrase() {
		System.out.println("A red sky at night..."); //shepherd in disguise!
	}
	
	public Farmer(String name, int age, double height, Boolean innovative, Boolean environmental) {
		super(name, age, height);
		this.innovative = innovative;
		this.environmental = environmental;
	}

	public Boolean getInnovative() {
		return innovative;
	}

	public void setInnovative(Boolean innovative) {
		this.innovative = innovative;
	}

	public Boolean getEnvironmental() {
		return environmental;
	}

	public void setEnvironmental(Boolean environmental) {
		this.environmental = environmental;
	}
	
	@Override
	public String toString() {
		return "This person's name is " + this.getName() + ". Their age is " + this.getAge() + ". They are " + this.getHeight() + "cm tall."  + "\nIt's " + this.getInnovative() + " that " + this.getName() + " is innovative in their field. It's also " + this.getEnvironmental() + " that they care about their environment.";
	}
}