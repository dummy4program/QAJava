package local.qa.datatypes;
//Task 1:
//    Create a class called “DataTypeExercise”.
//    Create a main method, either in the class, or in a separate runner.
//    Declare 3 variables, 2 primitive types and one String.
//    Print all 3 to the console.
//Task 2:
//    Create a method which has a return value. 
//    Call that method and print the value it returns to the console.
//Task 3++:
//	  Use 2 more data types and return the type at console.

public class DataTypesExercise {

	//public int intMethod (int i) {
	//	return i;
	//}

	public static void main(String[] args) {
		//1
		int varInt = 3;
		char varChar = 'J';
		String varString = "This is a string";
		System.out.println(varInt + " " + varChar + " " + varString);
		//2
		System.out.println(returnValueMethod(72));
		//3
		float varFloat = 3.2f;
		System.out.println(varFloat);
		System.out.println(((Object)varFloat).getClass().getSimpleName());
		double varDouble = 6.4d;
		System.out.println(varDouble);
		System.out.println(((Object)varDouble).getClass().getSimpleName());
	}
	
	//2
	public static int returnValueMethod (int anInt) {
		return anInt;
	}
}