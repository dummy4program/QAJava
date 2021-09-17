package local.qa.encapsulation;

//public class Encapsulation {
//    private int passportNumber = 1355417;
//    private double bankBalance = -537.86;
//    private String memorableWord = "pareidolia";
//
//    public int getPassportNumber(){
//        return passportNumber;
//    }
//
//    public void setPassportNumber(int newPassportNumber){
//        this.passportNumber = newPassportNumber;
//    }
//    
//    public static void main(String[] args) {
//
//    	Encapsulation test = new Encapsulation();
//    	System.out.println(test.passportNumber);
//    	
//    	test.setPassportNumber(12345);
//    	System.out.println(test.passportNumber);
//    	
//    	setPassportNumber(67890); // can't do this as the setter method relies on having an instance of the Class created to work from, protecting the original "default" Class value
    	
//		1) Create a new class call Encapsulation with 5 variables (one String, one integer, one double, one float and one long).
//		2) Encapsulate your variables (make them private and generate getters and setters).
//		3) Generate two constructors - one should be empty.
//		4) Use setters to set values in your Runner.java.
//		5) Use getters and System.out.println(); to print out the values in your Runner.java.
//		6) Generate toString in your Encapsulation.java and invoke it from Runner.java.

public class Encapsulation {

	private int varInt;
	private String varString;
	private double varDouble;
	private float varFloat;
	private long varLong;

	public Encapsulation(int varInt, String varString, double varDouble, float varFloat, long varLong) {
		super();
		this.varInt = varInt;
		this.varString = varString;
		this.varDouble = varDouble;
		this.varFloat = varFloat;
		this.varLong = varLong;
	}
	
	public Encapsulation() {
		super();
	}
	
	//setters
	
	public void setVarInt(int newVarInt) {
		this.varInt = newVarInt;
	}
	
	public void setVarString(String newVarString) {
		this.varString = newVarString;
	}
	
	public void setVarDouble(double newVarDouble) {
		this.varDouble = newVarDouble;
	}
	
	public void setVarFloat(float newVarFloat) {
		this.varFloat = newVarFloat;
	}
	
	public void setVarLong(long newVarLong) {
		this.varLong = newVarLong;
	}
	
	//getters
	
	public int getVarInt() {
		return varInt;
	}
	
	public String getVarString() {
		return varString;
	}
	
	public double getVarDouble() {
		return varDouble;
	}
	
	public float getVarFloat() {
		return varFloat;
	}
	
	public long getVarLong() {
		return varLong;
	}
}		
