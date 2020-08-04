package arraypackage;

public class ArrayExp1 {
	void ex1() {
		String[] name = { "Maulik", "Harsh", "Kartikey", "Dev", "KD" };

		 //System.out.println(name);
	//System.out.println(name[2]);
		// System.out.println("Hello");

		// for(int i=name.length-1;i>=0;i--){
		// System.out.println(name[i]+" "+name[i].length());
		for (int i = 1; i <= name.length; i++) {
			if (i % 2 == 0)
				System.out.println(name[i] + " " + i);
		}

	}

	public static void main(String[] a) {

		ArrayExp1 arrayExp1 = new ArrayExp1();
		arrayExp1.ex1();

	}

}
