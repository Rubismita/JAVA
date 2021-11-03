package Constructor;

class A{
	void add() {
		int x=10,y=20;
		int z=x+y;
		System.out.println("Result of Addition is:"+z);
	}
}
class B extends A{
	void sub() {
		int x=10,y=20;
		int z=x-y;
		System.out.println("Result of Substraction is:"+z);
	}
		
}

public class MultilevelInheritance extends B {
	void mul() {
		int x=10,y=20;
		int z=x*y;
		System.out.println("Result of Multiplication is:"+z);
	}

	public static void main(String[] args) {
		
		 MultilevelInheritance mi = new  MultilevelInheritance();
		 mi.add();
		 mi.sub();
		 mi.mul();
	}

}
