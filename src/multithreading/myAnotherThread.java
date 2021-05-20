package multithreading;

public class myAnotherThread extends Thread{
	public void run() {
		for(int j=11;j<=20;j++) {
			System.out.println("the value of j is : "+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}
