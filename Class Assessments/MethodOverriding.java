package Data.MyData;
class B{
	void show() {
		System.out.println("Parent method");
	}
}

public class MethodOverriding extends B {
	
	void show() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		/*B b = new  MethodOverriding();
		b.show(); op-child method*/
		
		MethodOverriding mo = new MethodOverriding();
		mo.show();  //op-child method
		
		/*B b = new B();
		b.show();parent method*/
		
		/*MethodOverriding mo = new MethodOverriding();
		mo.show(); //parent method 
		mo.show1();//child method*/

	}

}
