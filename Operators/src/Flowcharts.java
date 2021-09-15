
public class Flowcharts {

	//Create a method which accepts 3 parameters, 2 integers and a boolean.

	//If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
	
	public static void main(String[] args) {
		
		System.out.println(method1(1, 2, true));	//should be 3
		System.out.println(method1(3, 3, false));	//should be 9
		System.out.println(method1(1, 1, true));	//should be 2
		method2(1900);
		method2(3900);
	}
	
	public static int method1(int int1, int int2, boolean bool1) {
		if (bool1) {
			return int1 + int2;
		} else {
			return int1 * int2;
		}
	}
	
	public static void method2(int A) {
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
		
	}
	
}