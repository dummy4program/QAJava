package local.qa.abstractioninterfaces;

//Task 1:
//- Read through community module on Abstraction and Interfaces.
//- Create an interface called Vehicle, with some methods relevant to all vehicles.
//- Create some classes which implement your Vehicle interface, such as Bicycle, Car, Van etc.
//- Have these classes implement the methods differently to one another.
//- Create some other small interfaces and implement them on relevant classes.
//- e.g. convertible, sunroof, ecofriendly etc 
//- Upload your code to GitHub.

public class Runner {

	public static void main(String[] args) {

		Car car1 = new Car();
		Van van1 = new Van();
		Bicycle bike1 = new Bicycle();
		
		car1.move();
		van1.move();
		bike1.move();
		
		car1.breakDown();
		van1.breakDown();
		bike1.breakDown();
		
		bike1.savePlanet();
		
		car1.BeepHorn();
		van1.BeepHorn();

	}

}
