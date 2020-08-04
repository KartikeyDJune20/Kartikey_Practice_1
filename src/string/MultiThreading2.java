package string;

public class MultiThreading2 extends Thread {
	
public void run(){
		
		m2();
		
	}
	void m2(){
		
		for(int i=101;i<=200;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+":"+ Thread.currentThread().getName());
		}
	}

	

}
