package Demo1;

public interface A {
	void msg();

}

------------------
package Demo1;

public interface B extends A {
	void get();

}
---------------------
package Demo1;

public interface C extends A {
	void show();

}
------------------------------
package Demo1;

public class MyData implements B, C {

	
	public void msg() {
		System.out.println("I m parent Interface method");
	}

	
	public void show() {
		System.out.println("I m C Interface method");
	}

	
	public void get() {
		System.out.println("I m  B  Interface method");

	}
	public static void main(String args[]) {
		MyData md = new MyData();
		md.msg();
		md.show();
		md.get();
		
	}

}

