package Demo1;

public interface Development {
	void development();
	

}
----------------------
package Demo1;

public interface Tranning {
	void training();

}
-------------------

package Demo1;

public class MyClass implements Tranning, Development {

	
	public void development() {
		 System.out.println("Development Department");
	

	}

	public  void training() {
		System.out.println("Trainning Department");
		
		

	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.development();
		mc.training();

	}

}