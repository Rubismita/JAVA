package Data.MyData;

public class MyMethodUsingThis {
	void get() {
		System.out.println("Welcome to method 1");
		
	}
	void set() {
		//get();
		this.get();
		System.out.println("Welcome to method 2");
		
	}

	public static void main(String[] args) {
		MyMethodUsingThis mm = new MyMethodUsingThis();
		//mm.get();
		mm.set();
		

	}

}