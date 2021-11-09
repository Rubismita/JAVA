package Data.MyData;
class A{
	A(){
		System.out.println("This is default constructor");
	}
	A(int i){
		System.out.println(i);
	}
	
	void msg() {
		System.out.println("Welcome");
	}
}

public class SuperClassUsingSuper  extends A{
	SuperClass(){
		//super(4);
		System.out.println("This is child class constructor");
	}
	
	void msg() {
		super.msg();
		System.out.println("Good Bye");
	}

	public static void main(String[] args) {
		SuperClassUsingSuper sc = new SuperClassUsingSuper();
		sc.msg();
	

	}

}
