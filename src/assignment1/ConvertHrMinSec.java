package assignment1;

public class ConvertHrMinSec {
	static void hour(int s) {
		int h = s / 3600;
		int m = s % 3600;
		int x = m % 60;
		int y = m / 60;

		System.out.println(h + " hour " + y + " min " + x + "sec");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hour(12365478);

	}

}
