package MultiThreading;
class AAA implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Reading");
			System.out.println("Walking");
			System.out.println("Teaching");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

class BBB implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {

			System.out.println("Travelling");
			System.out.println("Enjoying");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}


public class RealLifeMultithreadingExample {

	public static void main(String[] args) {
		
		AAA a1=new AAA();
		BBB b1=new BBB();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		t1.start();
		t2.start();
		
	}

}
