package conditionexamples;

public class LoopEx1 {
	static void divisionDisplay(int x, int y){

		for(int i=x;i<=y;i++){
			if(i%3==0 && i%5==0)
				System.out.println(i+" is divisible by 3 and 5");
			else if (i%3==0)
				System.out.println(i+" divisible by 3");
			else if(i%5==0)
				System.out.println(i+" is dvisible by 5");
		}
		
		
		
	}
	static void findEvenNum(int x, int y){
		for(int i=x;i<=y;i++){
			if(i%2==0)
				System.out.println("Even "+i);
			else
				System.out.println("Odd "+i);
		}
	}

	public static void main(String[]a){
		
		findEvenNum(100, 500);
			
		divisionDisplay(1, 100);	
		}
	}

