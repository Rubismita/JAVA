package Constructor;

public class ParametarizedConstructor {
	ParametarizedConstructor(int id,String name,float salary)  {
		System.out.println("\nId="+id+"\nName="+name+"\nSalary="+salary);
	 }
	 public static void main(String[] args) {
		 ParametarizedConstructor c=new ParametarizedConstructor(2,"rubi",78);
		 
	 }

} 
