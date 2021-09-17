package local.qa.operators;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(calculatorNator(2, 2));
		System.out.println(calculatorMulti(3, 5));
		System.out.println(calculatorSubtract(7, 4));
		//System.out.println(calculatorDivide(10, 3));
		if (calculatorDivide(10,3) != 0d) {
			System.out.println(calculatorDivide(10, 3));
		} else {
			System.out.println("The division cannot be performed.");
		}
	}

	public static int calculatorNator(int calc1, int calc2) {
		return calc1 + calc2;
	}

	public static int calculatorMulti(int multi1, int multi2) {
		return multi1 * multi2;
	}

	public static int calculatorSubtract(int subtract1, int subtract2) {
		return subtract1 - subtract2;
	}

//	public static int calculatorDivide(int divide1, int divide2) {
//		return divide1 / divide2;
//	}

	public static double calculatorDivide(double divide1, double divide2) {
		
		//Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.
		
		if (divide1 < divide2) {
			return divide1 / divide2;
		} else {
			//System.out.println("The division cannot be performed.");
			return 0d;
		//	throw new RuntimeException("The division cannot be performed.");
		}
	}
}