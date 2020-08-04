package arraypackage;

import java.util.Scanner;

public class AssignmentQuestion1 {
	void missing(int num[]) {
		for (int i = 0; i < num.length; i++) {

			boolean flag = false;
			for (int j = 0; j < num.length; j++) {
				if (i == num[j]) {
					flag = true;
					break;

				}
			}
			if(!flag)
				System.out.println("Missing "+ i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide data:-");
		int[] number = new int[9];
		String data=sc.nextLine();
		String[] name=data.split(" ");
		int[] array=new int[name.length];
		

		//for (int i = 0; i <number.length; i++) {
			//number[i] = sc.nextInt();
			//System.out.print(number[i]);
		//}
		AssignmentQuestion1 m1 = new AssignmentQuestion1();
		m1.missing(number);

	}

}
