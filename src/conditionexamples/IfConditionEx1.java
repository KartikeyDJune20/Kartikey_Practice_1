package conditionexamples;

public class IfConditionEx1 {
	void m2(int l, int m) {
		int x = l + m / 2;

		if (x > 90) {
			if (x > 95)
				System.out.println("Good");
			else
				System.out.println("V.good");
		} else {

			if (x > 81)
				System.out.println("Not Bad");
			else if (x > 70)
				System.out.println("Need more pratice");
			else
				System.out.println("Meet me in person");

		}
	}

	String m3(int l, int m) {
		int x = (l + m) / 2;

		if (x > 90) {
			if (x > 95) {

				return "A++";

			} else {

				return "A+";

			}
		} else {

			if (x > 80) {

				return "A ";

			} else if (x > 70) {

				return "B+";

			}

			System.out.println("Meet me in person");
			return "Fail";

		}
	}

	String conditionExp() {
		String msg = "Hi";
		return msg;

	}

	public static void main(String[] args) {
		IfConditionEx1 ex1 = new IfConditionEx1();
		ex1.conditionExp();
		// String temp=ex1.conditionExp();
		System.out.println(ex1.conditionExp());
		ex1.m2(50, 12);
		ex1.m2(80, 23);
		ex1.m2(92, 95);
		ex1.m2(98, 87);
		System.out.println(ex1.m3(59, 36));
		System.out.println(ex1.m3(75, 98));
		System.out.println(ex1.m3(95, 85));
		System.out.println(ex1.m3(50, 100));
	}

}
