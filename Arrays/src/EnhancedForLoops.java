
import java.util.Arrays;

public class EnhancedForLoops {

	public static void main(String[] args) {

		//1 Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.
		
		String[] stringArray = {"this", "is", "a", "string", "array"};
		
		for (String i : stringArray) {
			System.out.println(i);
		}
		
		//2 Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.
		
		int[] intArray = new int[20];	
			
		for (int j = 0; j < intArray.length ; j++) {
			intArray[j] = j+1;
		}
		
		System.out.println(Arrays.toString(intArray));
		
		for (int value : intArray) {
			int square = value * value;
			System.out.println(square);
		}
		
		System.out.println(Arrays.toString(intArray));
		
	}

}
