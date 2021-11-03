package Interface;

public interface A {
	
	void sub();

}
--------------------------
package Interface;

public interface B {
	 
	void add();

}
---------------------------------
package Interface;

public class MultipleInheritanceUsingInterface implements A, B {
	
	 public void sub() {
		 int x=10;
		 int y=5;
		 int z=x-y;
		 System.out.println("Substraction="+z);
	 }
	 
	 public void add() {
		 int x=10;
		 int y=5;
		 int z=x+y;
		 System.out.println("Addition="+z);
	 }

	public static void main(String[] args) {
		
		MultipleInheritanceUsingInterface mi = new MultipleInheritanceUsingInterface();
		mi.add();
		mi.sub();
			

	}

}
