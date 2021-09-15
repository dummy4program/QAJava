import java.text.DecimalFormat;

public class Coins {

	public static int ten_pounds = 0;
	public static int five_pounds = 0;
	public static int twenty_pence = 0;
	public static int two_pence = 0;
	public static double cost = 0d;
	public static double payment = 0d;
	public static double change = 0d;
	
	public static void main(String[] args) {

		System.out.println("From £" + changeCalc(4.58, 20.00) + " you receive the following change:\n" + ten_pounds + " £10 notes\n" + five_pounds + " £5 notes\n" + twenty_pence + " 20p's\n" + two_pence + " 2p's");
		
	}

	public static double changeCalc (double cost, double payment) {
		
		DecimalFormat numberFormat = new DecimalFormat("#.00"); //need to fix decimal formatting
		
		change = payment - cost;
		
		while (change >= 10.00) {
			change = change - 10.00;
			ten_pounds++;
		}
			
		while (change >= 5.00) {
			change = change - 5.00;
			five_pounds++;
		}
			
		while (change >= 0.20) {
			change = change - 0.20;
			twenty_pence++;
		}
			
		System.out.println(change);
			
		while (change >= 0.02) {		//decimal rounding is broken, find fix
			change = change - 0.02;
			two_pence++;
		}
		
		return payment;
		
		}
	
}
