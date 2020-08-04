package arrayPractice;

import java.util.Scanner;

public class DuplicateNumber {
	void duplicate(int[] number) {
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++)
				if (number[i] == number[j]) {
					System.out.println("duplicate no. is " + number[j]);
				}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Data");
		int[] number = new int[9];
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();

		}

		DuplicateNumber m1 = new DuplicateNumber();
		m1.duplicate(number);

	}

}
