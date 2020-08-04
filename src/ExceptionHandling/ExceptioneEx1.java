package ExceptionHandling;

import java.util.Scanner;

public class ExceptioneEx1 {
	int x = 10;
	int y = 20;

	void division(int x, int y) {
		try {
			System.out.println("1");
			int z = x / y;
			System.out.println("Division :" + z);

		} catch (ArithmeticException ae) {
			System.out.println("In Catch");
		}
		System.out.println("2");

	}

	// Stack Trace
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide Data for variable 1");
		int x = sc.nextInt();

		System.out.println("Provide data for varibale 2");
		int y = sc.nextInt();

		ExceptioneEx1 e1 = new ExceptioneEx1();
		e1.division(x, y);
		System.out.println("4");

	}

}
