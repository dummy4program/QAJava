package local.qa.inheritance;

public class Person {
	
	private String name;
	private int age;
	private double height;
	
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void sleep() {
		System.out.println("zZzzzzZZz");
	}

	public void eat() {
		System.out.println("Nom nom nom");
	}
	
	public void favPhrase() {
		System.out.println("I love Java!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "This person's name is " + this.getName() + ". Their age is " + this.getAge() + ". They are " + this.getHeight() + "cm tall." ;
	}
}
