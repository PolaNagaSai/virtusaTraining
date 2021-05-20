package multithreading;

public class myThread implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("the value of i is : "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
	
	public static void main(String args[]) {
		myThread t1=new myThread();
		Thread th=new Thread(t1);
		
		myAnotherThread t2=new myAnotherThread();
		th.start();
		t2.start();
	}
}
