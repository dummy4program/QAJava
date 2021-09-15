
public class BlackJack {

	//Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.
		
	public static void main(String[] args) {

	System.out.println(blackJack(10,21));	//should give 21
	System.out.println(blackJack(21,10));	//should give 21
	System.out.println(blackJack(20,18));	//should give 20
	System.out.println(blackJack(18,20));	//should give 20
	System.out.println(blackJack(1, 22));	//should give 1
	System.out.println(blackJack(22, 1));	//should give 1
	System.out.println(blackJack(22,23));	//should give 0
	System.out.println(blackJack(23,22));	//should give 0
	System.out.println(blackJack(0,0));	//should give error message
	}
	
	public static int blackJack(int roll1, int roll2) {
		if (roll1 < 1 & roll2 < 1) {
			System.out.println("Integer values must be greater than 0.");
			return 0;
		}
		if (roll1 > 21 && roll2 > 21) {
			return 0;
		} else if(roll1 > 21) {
			return roll2;
		} else if(roll2 > 21) {
			return roll1;
		} else if (21 - roll1  > 21 - roll2) {  //because all possibilities over 21 are already accounted for, could just do a if roll1 > roll2 kind of statement
			return roll2;
		} else {
			return roll1;
		}
	}
}