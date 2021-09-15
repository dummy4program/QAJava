
public class Results {

	public static int physics = 0;
	public static int chemistry = 0;
	public static int biology = 0;
	public static int total = 0;
	public static float percentage = 0f;
	
	public static void main(String[] args) {

		printAll(78, 66, 87);
		percentageCalc();
	}
	
	public static void printAll(int physicsMark, int chemistryMark, int biologyMark) {
		
		physics = physicsMark;
		chemistry = chemistryMark;
		biology = biologyMark;
		
		total = physics + chemistry + biology;
		
		System.out.println("Your result for Physics was: " + physics + " out of 150.");
		System.out.println("Your result for Chemistry was: " + chemistry + " out of 150.");
		System.out.println("Your result for Biology was: " + biology + " out of 150.");
		System.out.println("Your total marks came to: " + total + " out of 450.");
	}

	public static void percentageCalc() {
		float percentage = (total*100)/450;
		System.out.println("Your overall percentage was: " + percentage + "%");
	}
}