package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Equality {
	void equality(int[] input1, int[] input2){
		//boolean flag=false;
	
		//for(int i=0;i< input1.length;i++){
			if( Arrays.equals(input1, input2)){
				//flag= true;
				System.out.println("Two arrays are equal");
			}
			else
				System.out.println("Two arrays are not equal");
				
			
		//}
		//if(flag==true)
		//System.out.println("Two array are equal");
		//else
		//System.out.println("Two array are not equal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Provide Data");
		 int[] input1= new int[9];
		 int[] input2=new int [9];
		 for (int i=0;i< input1.length;i++){
			 input1[i]=sc.nextInt();
			 
			 
		 }
		 System.out.println(input1);
		 for (int j=0;j< input1.length;j++){
			 input2[j]=sc.nextInt();
			 
		 }
		 System.out.println(input2);
		 Equality ex1=new Equality();
		 ex1.equality(input1, input2);
		 
	}

}
