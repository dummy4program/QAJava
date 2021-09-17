package local.qa.strings;

public class StringManipulationExercises {

	public static void main(String[] args) {

//		Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
//
//		Concatenate both values, capitalise both strings and print out the result.
//		The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
		
		String yesterday = "yesterday it was raining";
		String today = "today it is sunny";
		
		System.out.println(today.toUpperCase() + ", " + yesterday.toUpperCase());
		
//		Now use the substring method to print out: `TODAY IT IS RAINING`
		
		System.out.println(today.substring(0, 12).toUpperCase() + yesterday.substring(17, 24).toUpperCase());
		
//		For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:
//
		
		System.out.println("There are " + method1("liar, liar, bum's on fire") + " words in your phrase.");
		
		method2("sufferin succotash it's a wabbit!");
		
		method3("sufferin succotash it's a wabbit!");
		
	}
	
//	Method 1 - When given a String, count and return how many words there are in that String.

	public static int method1 (String bananas) {
		
		int words= 0;
		
		if (bananas.length() == 0) {
			words = 0;
		} else {
			words = 1;
		}
		
		for (int i = 0; i < bananas.length(); i++) {
			if (bananas.substring(i, i+1).equals(" ")) {
					words++;	//works for everything apart from strings with just empty spaces like " ", need some kind of AND condition in the if statement which checks if there is a next character after the space and if that character is a letter but can't get this to work due to "Out of bounds" errors trying to check for future characters in the main String using the limited methods available for the task.
		}
	}
		
		return words;
		
	}
	
//	Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
	
//	public static void method2 (String grapefruit) {
//		
//		for (int i = 0; i < grapefruit.length(); i++) {
//			if (grapefruit.substring(i, i+1).equals(" ")) {
//				System.out.println(grapefruit.substring(0, i));
//				System.out.println(grapefruit.substring(i+1,grapefruit.length()));
//			}
//		}
//		
//	}
	
	public static void method2 (String grapefruit) {
	
		int words = 0;
		
	for (int i = 0; i < grapefruit.length(); i++) {
		if (grapefruit.substring(i, i+1).equals(" ") || i == (grapefruit.length() - 1)) {
			System.out.println(grapefruit.substring(words, i + 1));
			words = i + 1;
		}
	}
	}
	
//	Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
	
	public static void method3 (String kiwis) {
		
		int words = kiwis.length();
		
	for (int i = kiwis.length(); i > 0; i--) {
		if (kiwis.substring(i - 1 , i).equals(" ")) {
			System.out.println(kiwis.substring(i, words));
			words = i;
		} else if (i == 1) {
			System.out.println(kiwis.substring(i - 1, words));
		}
	}
	}
	
//	Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message.
	
	
	
}
