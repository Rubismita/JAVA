package MultiThreading;


	class AA implements Runnable{
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("Welcome to MultiThreading");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}
	class BB implements Runnable{
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("Our thread is running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}
	public class CreatingThreadByImplementingRunnable {

	public static void main(String[] args) {
		
		AA a1=new AA();
		BB b1=new BB();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		t1.start();
		t2.start();
	
	}

}
