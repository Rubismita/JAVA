package Demo1;

public abstract class MyAbstractClass {
	abstract void getData();
	void showData() {
		System.out.println("Welcome to Abstract World");
	}

}
--------------------
package Demo1;

import java.util.Scanner;

public class MyDataClass extends MyAbstractClass {

	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Your name is " +name);

	}

	public static void main(String[] args) {
		MyDataClass mc = new MyDataClass();
		//mc.getData();
		mc.showData();
		mc.getData();
	

	}

}
