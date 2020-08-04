package superThisdemo;

public class superThis  extends Parent {
	int x=20;
	void m1(){
		
		System.out.println("Child m1 : "+ super.x);
	}
void m2(){
	//super.m1();
	m1();
	

}
public static void main(String[] args) {
	superThis s1=new superThis();
	s1.m2();
	
	
}
}
