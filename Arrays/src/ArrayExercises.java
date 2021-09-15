
import java.util.Arrays;

public class ArrayExercises {

	public static void main (String[] args) {
	
		int[] testArray = new int[10];
		
//		testArray[0] = 1;
//		testArray[1] = 2;
//		testArray[2] = 3;
//		testArray[3] = 4;
//		testArray[4] = 5;
//		testArray[5] = 6;
//		testArray[6] = 7;
//		testArray[7] = 8;
//		testArray[8] = 9;
//		testArray[9] = 10;
		
//		for (int i : testArray) {
//			System.out.println(i);
//		}
		
		for (int i = 0; i < testArray.length ; i++) {
			testArray[i] = i+1;
			System.out.println(testArray[i]);
		}
		
		System.out.println(Arrays.toString(testArray));
		
		//with for-each loop (enhanced for loop)
		
		for (int j : testArray) {
			j *= 10;				//doesn't change the actual list value
			System.out.println(j);	
		}
		
		System.out.println(Arrays.toString(testArray));
		
		//alternative with for loop
		
		for (int j = 0; j < testArray.length ; j++) {
			testArray[j] *= 10;		//changes original list value
			System.out.println(testArray[j]);
		}
	
		System.out.println(Arrays.toString(testArray));
		
		//optimised on one line
		
		for (int k = 0; k < testArray.length; k++) {
			System.out.println(testArray[k] = testArray[k] * 10); //changes original list value
		}
		
		System.out.println(Arrays.toString(testArray));
	}
	
}
