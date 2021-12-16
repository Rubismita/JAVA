package Maven_Pratical.LamdaExpresssionExamples;

public class Example4 {
public static void main(String[] args) {
		
		Thread t1=new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("Welcome to MultiThreading");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
	    }
	);
		Thread t2=new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("Our thread is running");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
	   }
	);
		t1.start();
		t2.start();
		
		
	}

}

