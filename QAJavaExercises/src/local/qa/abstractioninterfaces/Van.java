package local.qa.abstractioninterfaces;

public class Van implements Vehicle, Horn {

	@Override
	public void move() {
		System.out.println("Get out of my way!");
		
	}

	@Override
	public void breakDown() {
		System.out.println("I've overheated! Chill out man.");
		
	}

	@Override
	public void BeepHorn() {
		System.out.println("I said get out of my way! #roadrage");
		
	}

}
