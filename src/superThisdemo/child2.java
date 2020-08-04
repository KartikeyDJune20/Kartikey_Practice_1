package superThisdemo;

public class child2 extends Parent {
	int x=20;
	
	void m1() {

		System.out.println("Child2 m1");
	}

	void m2() {
		int x=30;
		

		System.out.println("Child2 m2"+ this.x);
	}

	void m3() {

		System.out.println("Child2 m3");
	}
}
