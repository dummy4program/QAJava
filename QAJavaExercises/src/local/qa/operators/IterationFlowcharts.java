package local.qa.operators;

public class IterationFlowcharts {

	public static void main(String[] args) {
		
//		flowchartWhile1();
//		flowchartWhile2();
//		flowchartWhile3();
//		flowchartFor1();
//		flowchartFor2();
//		flowchartFor3();
		flowchartFor5();
	}

	public static void flowchartWhile1() {
		int A = 100;
		while (A <= 200) {
			System.out.println(A);
			A++;
		}
	}
	
	public static void flowchartWhile2() {
		int A = 100;
		while (A <= 201) {
			if (A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			A++;
		}
	}
	
	public static void flowchartWhile3() {
		int number = 1;
		int times = 0;
		while (times < 10) {
			while (number <= 10) {
				System.out.println(number);
				number++;
			}
			number = 1;
			times++;
		}

	}
	
	public static void flowchartFor1() {
		for (int A = 100; A <= 200; A++) {
			System.out.println(A);
		}
	}
	
	public static void flowchartFor2() {
		for (int A = 100; A <= 201; A++) {
			if (A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}	
	}
	
	public static void flowchartFor3() {
		for (int times = 0; times <10; times++) {
			for (int number = 1; number <= 10; number++) {
				System.out.println(number);
			}
		}
	}
	
	public static void flowchartFor5() {
		for (int number = 1; number <= 10; number++) {
			for (int numberTimes = 1; numberTimes <= number; numberTimes++) {
				System.out.println(number);
			}
		}
	}
}