package assignment1;

public class Swap {
	static void swapwith3(int a, int b){
		int c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b);
	}
	
	static void swapWithout(int a, int b){
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
swapwith3(12,13);
swapWithout(19,21);

	}

}
