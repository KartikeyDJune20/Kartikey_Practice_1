package assignment1;

public class PrimeNo {
	int temp=0;
	int sum=0;
	
	void isPrime(int number) {// main if build for one never change it just make
								// other method for the loop
		boolean count = false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count = true;
				// System.out.println(number + " is not a prime no.");
				break;

			}
		}
		if (count == false) {

			System.out.println(number + " is a prime no.");
			temp++;
			sum=sum+number;
			
		}
	}

	void primeNoFromRange(int startN, int endN) {// This is for the range we
													// need
		for (int i = startN; i <= endN; i++) {
			isPrime(i);

		}
		System.out.println("Total count is "+temp);
		System.out.println("Total sum is "+sum);
		avag();
		
	}

	void avag(){
		double avg=(double)sum/temp;
		System.out.println("Average is "+avg);
		
	}
	public static void main(String[] args) {
		PrimeNo primeNo = new PrimeNo();
		// for(int start=25;start<30;start++){
		// primeNo.isPrime();
		// }

		primeNo.primeNoFromRange(1, 100);
		//primeNo.avag();
		
	}

}
