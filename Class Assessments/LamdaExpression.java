package Synchronization;

public class LamdaExpression {

	public static void main(String[] args) {
		Thread t1=new Thread(() -> {
			int i = 0;
			while(i<=5) {
				System.out.println("This is first  thread in lamda");
				i++;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
	    }
	);
		Thread t2=new Thread(() -> {
			int j = 0;
			while(j<=5){
				System.out.println("This is second thread in lamda");
				j++;
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
