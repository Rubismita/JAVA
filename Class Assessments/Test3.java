package Synchronization;
class App1{
	int n;
	boolean flag=false;
	public synchronized void put(int n) {
		while(flag) {
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		this.n=n;
		System.out.println("Put = "+n);
	}
	public synchronized  void get() {
		while(!flag) {
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Get = "+n);
		flag=false;
		notify();
	}
}
class Producer1 implements Runnable{
	App1 a;
	public Producer1(App1 a) {
		this.a=a;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(500);
			}catch (Exception e){
				System.out.println(e);
			}
		}
		
	}
}
class Consumer1 implements Runnable{
	App1 a;
	public Consumer1(App1 a) {
		this.a=a;
		Thread t1 = new Thread(this,"Consumer");
		t1.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.get();
			try {
				Thread.sleep(500);
			}catch (Exception e){
				System.out.println(e);
			}
		}
		
	}
}
public class Test3 {

	public static void main(String[] args) {
		App1 a=new App1();
		new Producer1(a);
		new Consumer1(a);

	}

}
