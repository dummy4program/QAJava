package local.qa.inheritance;

public class Runner {

//// Exercise:
//    - Design a class named Person and two subclasses named Banker and Farmer.
//    - Every person should have some generic attributes (e.g. name, age) and functionality (e.g. eat, sleep).
//    - The Banker and Farmer subclasses should also have attributes and functionality unique to them.
//    - The two subclasses should have their own custom constructors to set any relevant values.
//    - The two subclasses should also override a method from the Person class and implement it differently.
//    - All three classes should override the toString() method in order to print some useful information about the class.
//    - The Subclass toString() methods should include the same information as Person, but with their own unique info on top.
//    - Use encapsulation - private class variables with getters & setters.
//    - Use a separate runner class with a main method.

	public static void main(String[] args) {
		
		Person person1 = new Person("Dave", 28, 178);
		Banker banker1 = new Banker("Jeremy", 27, 169, true, true);
		Farmer farmer1 = new Farmer("Jim", 38, 184, true, true);
		
		System.out.println(person1.toString());
		person1.favPhrase();
		System.out.println(banker1.toString());
		banker1.favPhrase();
		System.out.println(farmer1.toString());
		farmer1.favPhrase();
		
		// polymorphism
		
		System.out.println("--- Polymorphism ---");
		
		Person banker2 = new Banker("Steve", 42, 178, false, true);
		Object farmer2 = new Farmer("Jerry", 38, 185, false, true);
		Person farmer3 = new Farmer("Jezzer", 46, 179, true, true);
		Farmer farmer4 = new Farmer("Jimmy", 54, 180, true, true);
		
		banker2.favPhrase();
		
		((Farmer)farmer2).favPhrase(); //object needs to be cast to access .favPhrase method
		((Person)farmer2).favPhrase(); //gives same output as if cast as Farmer - due to using Farmer Class constructor for this object and Java recognising overridden method?
		farmer3.favPhrase();
		farmer4.favPhrase();
		
		((Farmer)farmer2).goodWithHands();
		((Farmer)farmer3).goodWithHands(); //Person Class needs to be cast to access child Class specific methods
		farmer4.goodWithHands();
		
	}
	
}