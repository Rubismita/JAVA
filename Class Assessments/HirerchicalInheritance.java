package Constructor;
  
class Add{
	void add() {
		System.out.println("Addition");
	}
}
class Sub extends Add{
	void sub() {
		System.out.println("Substraction");
	}
}
class Mul extends Add{
	void mul() {
		System.out.println("Multiplication");
	}
}

public class HirerchicalInheritance {

	public static void main(String[] args) {
		
		Sub b=new Sub();
		b.add();
		b.sub();
		Mul c=new Mul();
		c.add();
		c.mul();
	

	}

}
