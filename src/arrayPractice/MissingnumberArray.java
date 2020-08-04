package arrayPractice;

import java.util.Scanner;


//0 1 3 4 5 6 7 8 9 10
public class MissingnumberArray {
	void missing(int[] number){
		for (int i=0;i<number.length;i++){
			boolean flag=false;
			for(int j=0;j<number.length;j++){
				if(i==number[j]){
					flag=true;
					break;
					
				}
				
			}
					
			if(!flag)
				System.out.println("Missing no. :"+i);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide Data");
		int [] number= new int[9];
		for (int i=0;i<number.length;i++){
			number[i]=sc.nextInt();			
		}
		MissingnumberArray Ex1=new MissingnumberArray();
		Ex1.missing(number);
		
		
		
	}

}
