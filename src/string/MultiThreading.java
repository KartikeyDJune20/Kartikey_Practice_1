package string;

public class MultiThreading extends Thread {
	public void run(){
		
		m1();
		
	}
void m1(){
	
	for(int i=1;i<=100;i++){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(i+":"+Thread.currentThread().getName());
	}
}
	

}
