package conditionexamples;

public class DataTypes {
	
	void exp1(){
		double x1=(double)9/4;
		System.out.println(x1);
		double x2=(double)9/4.0;
		System.out.println(x2);
		int x3=(int)9.0/4;
		System.out.println(x3);
	}
	public static void main(String[] args) {
		
	DataTypes d1=new DataTypes();
	d1.exp1();

}
}
