package local.qa.encapsulation;

public class Runner {

	public static void main(String[] args) {
		
	Encapsulation numberOne = new Encapsulation(1, "Hello", 1.01, 1.1f, 11);
	Encapsulation numberTwo = new Encapsulation(2, "Goodbye", 2.02, 2.2f, 22);
		
	numberOne.setVarInt(100); //instances need to be made within the Runner class or can't be recognised

	System.out.println(numberOne.getVarInt());
	
	}

}
