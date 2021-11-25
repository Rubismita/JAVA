package Synchronization;
class B{
	int c;
	public synchronized  void count() {
		c++;
		//System.out.println(c);
		
		
	}
}
public class Test1 {

	public static void main(String[] args) throws Exception {
		B d=new B();
		
		Thread t = new Thread(new Runnable() 
		{
			public void run() {
			for(int i=1;i<=5500;i++) {
				d.count();
			}
				}	
			}
		);

		Thread t1 = new Thread(new Runnable() 
		{
			public void run() {
			for(int i=1;i<=5888;i++) {
				d.count();
			}
				}	
			}
		);
		t.start();
		t1.start();
		t.join();
		t1.join();
		
		System.out.println("count =" +d.c);

	}

}
