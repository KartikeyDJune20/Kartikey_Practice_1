package stringAssignment;

public class ReverseInteger {

	public static void main(String[] args) {
		int input=12345;
		String str=input+"";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+ str.charAt(i)+"";
			
		}
		System.out.println(rev);

	}

}
