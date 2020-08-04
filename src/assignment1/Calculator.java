package assignment1;

public class Calculator {
	static int sum(int x, int y) {

		return x + y;

	}

	static int subtract(int x, int y) {
		return x - y;
	}

	static int multiply(int x, int y) {
		return x * y;
	}

	static double divide(int x, int y) {
		return y / x;

	}

	static int remainder(int x, int y) {
		return x % y;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10, 20));
		System.out.println(multiply(10, 20));
		System.out.println(divide(10, 2096));
		System.out.println(subtract(10, 20));
		System.out.println(remainder(10, 20));

	}

}
