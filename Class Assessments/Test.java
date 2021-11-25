package Synchronization;
class A{
	int c;
	public void count() {
		c++;
		System.out.println(c);
	}
}

public class Test {

	public static void main(String[] args) {
		A d = new A();
		d.count();
	}

}
