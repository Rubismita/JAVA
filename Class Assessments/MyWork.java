package Interface;

public interface Data {

	void msg();
}
---------------------------------------

package Interface;

public interface Work extends Data {
	void get();

}
-------------------------------------------
package Interface;

public class MyWork implements Work {

	
	public void msg() {
		
		System.out.println("Methos of patent Interface");
	}

	public void get() {
	 
		System.out.println("Method of child Interface");
	}
		 

	public static void main(String args[]) {
		MyWork mw =new MyWork();
		mw.msg();
		mw.get();
	}
	}
