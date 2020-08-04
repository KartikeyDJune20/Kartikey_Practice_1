package arraypackage;

import java.util.Scanner;

public class arrayExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String firstName=sc.next();
		
		String lastName=sc.next();
	
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.println(firstName + lastName + i );
			
		}
		
	}

}
