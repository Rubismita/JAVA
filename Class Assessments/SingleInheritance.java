package Constructor;

class Data {
	
	void msg() {
		System.out.println("Lets learn Inheritance");
	}
	
}

public class SingleInheritance extends Data {
	
	void show() {
		System.out.println("It's a derived class");
		
	}

	public static void main(String[] args) {
		SingleInheritance si = new SingleInheritance();
		si.msg();
		si.show();
		
		

	}

}
