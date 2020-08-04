package arraypackage;

import java.util.Scanner;

public class missingExp1 {
	void display(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	void findMissingNo(int[] number) {
		
		for (int i = 1; i <=number.length; i++) {
			boolean flag = false;
			for (int j = 0; j < number.length; j++) {

				if (i == number[j]) {
					flag = true;
					break;
				}

			}
			if (!flag)
				System.out.println("Missing " + i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide data");
		int[] number = new int[8];

		// String line=sc.nextLine();
		// String[] data=line.split(" ");
		for (int i = 0; i <number.length; i++) {
			number[i] =sc.nextInt();
		}
		
		missingExp1 ex2 = new missingExp1();
		// ex2.display(number);
		ex2.findMissingNo(number);
	}

}
