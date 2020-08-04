package stringAssignment;


	

public class ReverseStringWithelements {
		static String m1(String str){
			String rev="";
			for(int i=str.length()-1;i>=0;i--){
				rev=rev+str.charAt(i);
				
			}
			return rev;
			
		
	}

	public static void main(String[] args) {
		String str= "there is an apple";
		String s[]=str.split(" ");
		System.out.println(s[0]);
		String rev="";
		int len=s.length;
		
		for(int i=len-1;i>=0;i--){
			//System.out.println(s[i]);
			rev=rev+m1(s[i])+" ";
			
					
					
		}
		System.out.println(rev);
		
	}

}
