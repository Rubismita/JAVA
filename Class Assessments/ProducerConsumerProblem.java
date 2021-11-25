package Synchronization;
class App{
	int n;
	public void put(int n) {
		this.n=n;
		System.out.println("Put = "+n);
	}
	public void get() {
		System.out.println("Get = "+n);
	}
}
class Producer implements Runnable{
	App a;
	public Producer(App a) {
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
class Consumer implements Runnable{
	App a;
	public Consumer(App a) {
		this.a=a;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			//a.put(i++);
			a.get();
			try {
				Thread.sleep(500);
			}catch (Exception e){
				System.out.println(e);
			}
		}
		
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		App a=new App();
		new Producer(a);
		new Consumer(a);
		

	}

}
