package Constructor;

import java.util.Scanner;

public class FirstConstructorProgramma {
				int id;
				String name;
				float salary;
				 String address;
		FirstConstructorProgramma()  {
				 Scanner s = new Scanner(System.in);
				 System.out.println("Enter the Details ::");
				 id = s.nextInt();
				 name= s.next();
				 salary=s.nextFloat();	 
				 address = s.next();
			 }
			 void show() {
				 System.out.println("id"+id+"Name"+name+"salary"+salary+"Address"+address);
			 }
			 public static void main(String[] args) {
				 FirstConstructorProgramma c=new FirstConstructorProgramma();
				 
				 c.show();
			 }
		


	}


