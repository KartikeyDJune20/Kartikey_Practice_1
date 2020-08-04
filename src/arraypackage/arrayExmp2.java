package arraypackage;

import java.util.Scanner;

public class arrayExmp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide data");
		String line=sc.nextLine();
		String[] data=line.split(" ");
		String fname=data[0];
		String lname=data[1];
		int count= Integer.parseInt(data[2]);
		int i=1;
		while(i<=count){
			System.out.println(fname + " "+lname +" "+ i);
			i++;
			sc.close();
		}
		
	}

}
