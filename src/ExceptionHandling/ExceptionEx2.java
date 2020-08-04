package ExceptionHandling;

import java.util.Scanner;

public class ExceptionEx2 {
	// Static void getMessage(String k){
		
	//}
	static void doOperation(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Provide data");
		String str= sc.nextLine();
		String [] str1= str.split(" ");
		int input1=Integer.parseInt(str1[0]);
		int input2=Integer.parseInt(str1[1]);
		
		
		try{
			System.out.println("im in try block");
			int result=input1/input2;
			System.out.println(result);
			System.out.println("try block executed successfully");
			System.out.println(9);
			ExceptionEx2 ex1=new ExceptionEx2();
			ex1=null;
			ex1.m1();
			
			System.out.println("M1 is aclled successfully");
				
		}
		catch(ArithmeticException ae){
			System.out.println("im in catch block");//Stack Trace we should print 
			ae.printStackTrace();
			//ae.getMessage("Kartikey");
			
		}
		System.out.println(2);
		
	}
	void m1(){
		System.out.println("in M1");
	}
	public static void main(String[] args) {
		//ExceptionEx2 ex1=new ExceptionEx2();
		doOperation();
		System.out.println("main start");
		
	
		
	}
}
