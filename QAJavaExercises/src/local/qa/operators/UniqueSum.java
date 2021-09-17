package local.qa.operators;

public class UniqueSum {
	
	// Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.

//	public static int calc1;
//	public static int calc2;
//	public static int calc3;
	
	public static void main(String[] args) {

		System.out.println(uniqueSum(1, 2, 3)); // should be 6
		System.out.println(uniqueSum(3, 3, 3)); // should be 0
		System.out.println(uniqueSum(1, 1, 2)); // should be 2
		
	}

	public static int uniqueSum(int num1, int num2, int num3) {
		
		int calc1 = num1;
		int calc2 = num2;
		int calc3 = num3;
		
		if (num1 == num2) {
			calc1 = 0;
			calc2 = 0;
		} if (num1 == num3) {
			calc1 = 0;
			calc3 = 0;
		} if (num2 == num3) {
			calc2 = 0;
			calc3 = 0;
		}
		
		return calc1 + calc2 + calc3;
	}
	
}