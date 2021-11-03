package Interface;

public interface B {
	 
	void add();

}
-----------------------------------------------
package Interface;

public class MyData implements Data {
	 
	public void msg() {
		System.out.println("Welcome to interface");
	}


 public static void main(String args[]) {
	 MyData d = new MyData();
	 d.msg();
 }
}