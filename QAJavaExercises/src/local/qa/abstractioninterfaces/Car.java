package local.qa.abstractioninterfaces;

public class Car implements Vehicle, Horn {

	@Override
	public void move() {
		System.out.println("Eat my dust.");
		
	}

	@Override
	public void breakDown() {
		System.out.println("My battery is dead. Sad times.");
		
	}

	@Override
	public void BeepHorn() {
		System.out.println("Beep beep I'm in my jeep... not!");
		
	}

}
