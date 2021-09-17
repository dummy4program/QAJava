package local.qa.inheritance;

public class Banker extends Person {

	private Boolean degree = true;
	private Boolean ego =  true;
	
	public void goodWithNumbers() {
		System.out.println("1 + 1 = 2");
	}
	
	@Override
	public void favPhrase() {
		System.out.println("Money, money, money!");
	}

	public Banker(String name, int age, double height, Boolean degree, Boolean ego) {
		super(name, age, height);
		this.degree = degree;
		this.ego = ego;
	}

	public Boolean getDegree() {
		return degree;
	}

	public void setDegree(Boolean degree) {
		this.degree = degree;
	}

	public Boolean getEgo() {
		return ego;
	}

	public void setEgo(Boolean ego) {
		this.ego = ego;
	}

	@Override
	public String toString() {
		return "This person's name is " + this.getName() + ". Their age is " + this.getAge() + ". They are " + this.getHeight() + "cm tall." + "\nIt's " + this.getDegree() + " that " + this.getName() + " has a degree. It's also " + this.getEgo() + " that they have an ego too.";
	}
	
}
