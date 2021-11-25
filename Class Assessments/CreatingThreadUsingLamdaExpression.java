package MultiThreading;

public class CreatingThreadUsingLamdaExpression {

	public static void main(String[] args) {
		
		Thread t1=new Thread(() -> {
			for(int i=1;i<=10;i++) {
				System.out.println("Welcome to MultiThreading");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
	    }
	);
		Thread t2=new Thread(() -> {
			for(int i=1;i<=10;i++) {
				System.out.println("Our thread is running");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
	   }
	);
		t1.start();
		t2.start();
	}

}
