package arguements;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		int sum=0;
		
		for(int i=0;i<args.length;i++){
			sum=sum+ Integer.parseInt(args[i]);
			
		}
		System.out.println(sum);
	}

}
