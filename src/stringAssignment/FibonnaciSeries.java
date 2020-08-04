package stringAssignment;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=7;
		int num1=0;
		int num2=1;
		int sum=0;
		//String str=num1+num2+"";
		//System.out.println(str);
	System.out.print(num1+" "+num2);
		int i=2;
		
	while(i<input){
		
		sum=num1+num2;
		System.out.print(" "+sum);
		num1=num2;
		num2=sum;
		i++;
		
		
		
	}
		
		
	

	}

}
