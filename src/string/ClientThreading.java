package string;

public class ClientThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading a1= new MultiThreading();
		MultiThreading2 a2= new MultiThreading2();
		a1.setName("Bhains");// hamesa start se pahle likha hota hai 
		a2.setName("Hero");
		a1.start();// agar yaha run ko call kia to multi thread nahi hai
		
		a2.start();
	//	Thread.sleep(10000);// ek thread pe ek hi baar 
		MultiThreading b1=new MultiThreading();
		
		
		//a1.start();// ek baar start hui use fir nahi initialize nahi kar sakte Run time pe aaega error
		b1.start();
		
			//a1.m1();
			//a2.m2();			
	}

}
