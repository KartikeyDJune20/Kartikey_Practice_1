package arraypackage;

public class ArrayStringMiddleChar {
	
	 static void ex1() {
		String[] name = { "kartikey", "dev", "Suman", "sharma", "Technocredits" };
		for(int i=0;i<=name.length;i++){
		 for(int j=0;j<name.length-1;j++){
			 
			 int len=name[j].charAt(i);
			 System.out.println(len);
		 }
		
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1();
		
	}

}


