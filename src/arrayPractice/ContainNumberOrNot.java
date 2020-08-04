package arrayPractice;

import java.util.Scanner;

public class ContainNumberOrNot {
	void numberNotInArray(int[] input1, int number) {
		boolean flag = false;

		// 1 2 3 4 5 6 7 8 9 10
		for (int i = 0; i < input1.length; i++) {
			if (input1[i] == number) {
				flag = true;
				System.out.println(number+": Number is present in the array");
				break;

			}

		}
		if (!flag)
			System.out.println(number+": Number is not present in the array");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 8;
		System.out.println("Provide Data");
		int[] input1 = new int[9];

		for (int i = 0; i < input1.length; i++) {
			input1[i] = sc.nextInt();
		}
		//System.out.println(input1);
		ContainNumberOrNot ex2 = new ContainNumberOrNot();
		ex2.numberNotInArray(input1, number);

	}

}
