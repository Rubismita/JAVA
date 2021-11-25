package MultiThreading;
class A extends Thread{
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
class B extends Thread{
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
public class CreatingThreadByExtendingThread {
		public static void main(String[] args) {
			A a= new A();
			B b=new B();
			a.start();
			b.start();
	}
}
