package Method;

import java.util.Scanner;

public class ClassAndObjectAndMethod {

		
		int id;
		String name;
		float salary;
		 
	 void get() {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the Details ::");
		 id = s.nextInt();
		 name= s.next();
		 salary=s.nextFloat();	 
	 }
	 void show() {
		 System.out.println("id"+id+"Name"+name+"salary"+salary);
	 }
	 public static void main(String[] args) {
		 ClassAndObject c=new ClassAndObject();
		 c.get();
		 c.show();
	 }
}
