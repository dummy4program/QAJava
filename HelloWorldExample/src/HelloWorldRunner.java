
public class HelloWorldRunner {

	//1. Outputs "HelloWorld" to the console.
	//2. Return "HelloWorld" as a String.
	//3. Has a method that takes a String parameter and outputs this to the console.
	
	//1
	
	//public static void main(String[] args) {
	//	System.out.println("HelloWorld");
	//}

	//2
	
	//public static void printMessage() {
	//	String message = "HelloWorld";
	//	System.out.println(message);
	//}
	
	//public static void main(String[] args) {
	//	printMessage();
	//}
	
	//3
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	//void method doesn't give anything back
	
	public static void main(String[] args) {
		printMessage("HelloWorld");
		System.out.println(usingReturn("Output four"));
	}

	//4 Modify your method to return a String once called, which you then use to output to the console
	
	public static String usingReturn(String nameStr) {
		return nameStr;
	}
	
	//return method will carry the value 
}
