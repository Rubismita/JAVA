package MultiThreading;

public class JoinMethodToDieThread {

	public static void main(String[] args) throws Exception{
		
		Thread t1=new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("Welcome to MultiThreading");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
	    }
	);
		Thread t2=new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("Our thread is running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
	   }
	);
		t1.setName("MyThread");
		t1.setName("MyThread1");
		
		System.out.println(t1.getName());
		System.out.println(t1.getName());

		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		t1.setPriority(t1.MAX_PRIORITY);
		t2.setPriority(t2.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.join();//to die thread
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println("Thread Task is Completed");
	}

}


