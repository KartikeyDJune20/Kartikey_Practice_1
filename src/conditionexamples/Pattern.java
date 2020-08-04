package conditionexamples;

public class Pattern {
	 static int i = 10;
	void star() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	void star2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i % 2 == 0)
					System.out.print("*");

			}
			System.out.println();
		}
	}

	void switchExp1(String name) {
		switch (name) {
		case "Maulik":
			System.out.println(name);
			break;
		case "abc":
			System.out.println(name + " kartikey");
			// break;
		case "kartikey":
			System.out.println(name);
			// break;
		case "Suman":
			System.out.println(name);
			// break;
		default:
			System.out.println("KD");

		}
	}

	void dowhileExp1() {
		
		do {
			System.out.println((i+2));
			i--;
		} while (i > 5);

	}

	void doWhileExp2() {
		
		boolean flag = false;
		int rollNo = 5;
		if (rollNo > 0) {
			flag = true;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = new Pattern();
		 pattern.star2();
		// pattern.switchExp1("abc");
		// pattern.dowhileExp1();
		// int i = 5;
		// while (i > 0) {
		// if (i % 2 == 1)

		// i--;
		// System.out.println(i);

		// }

	}

}
