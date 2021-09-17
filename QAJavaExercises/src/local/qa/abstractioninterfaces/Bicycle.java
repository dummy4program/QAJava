package local.qa.abstractioninterfaces;

public class Bicycle implements Vehicle, EcoFriendly {

	@Override
	public void move() {
		System.out.println("Eco-friendly mode engaged.");
		
	}

	@Override
	public void breakDown() {
		System.out.println("You punctured my tyre! Riding over those lego bricks wasn't a good idea.");
		
	}

	@Override
	public void savePlanet() {
		System.out.println("Save the trees!");
		
	}

}