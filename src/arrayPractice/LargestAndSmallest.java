package arrayPractice;

import java.util.Scanner;

public class LargestAndSmallest {
	void largestAndSmallest(int[] number){
		int max= number[0];
		int min= number[0];
		for (int i=1;i<number.length;i++){
			
			if (number[i]> max){
				max =number[i];
				
			}
			if (number[i]<min){
				min=number[i];
				
			}
		}
		System.out.println("Largest no. in the array is :"+ max);
		
		System.out.println("Smallest no. in the array is :"+ min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide data");
		//int n;
		
		int[] number=new int [9];
		for (int i=0;i<number.length;i++){
			number[i]=sc.nextInt();			
		}
		LargestAndSmallest ex1=new LargestAndSmallest();
		ex1.largestAndSmallest(number);
	}

}
