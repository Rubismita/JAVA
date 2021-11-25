package MultiThreading;

public class ReducingCodesofThred {

	public static void main(String[] args) {
		Runnable r1=new Runnable() {
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("Welcome to MultiThreading");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	};
	
	Runnable r2=new Runnable() {
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("Our thread is running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();

	}

}
