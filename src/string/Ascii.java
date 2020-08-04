package string;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Kartikey";
		String s2="Kartikey";
		String s3=new String( "Kartikey");
		String s4=new String( "Kartikey");
		
		if(s1==s2)// reference compare// memory address
			System.out.println("S1==S2");
		if(s1.equals(s2))// content compare
			System.out.println("s1.equals(s2)");
		
		
		if(s1==s3)
			System.out.println("s1==s3");
		if(s1.equals(s3))
			System.out.println("s1.equals(s3)");
		
		
		if(s1==s4)
			System.out.println("S1==S4");
		if(s1.equals(s4))
			System.out.println("s1.equals(s4)");
		
		
		if(s2==s4)
			System.out.println("S2==S4");
		if(s2.equals(s4))
			System.out.println("s2.equals(s4)");
		
		
		if(s3==s4)
			System.out.println("S3==S4");
		if(s3.equals(s4))
			System.out.println("s3.equals(s4)");
		
		
		
			//for(char ch='A';ch<='Z';ch++){
				//int temp=ch;
				//System.out.println(ch+ ":"+(int)ch);
			
			}
			
	}

//}
