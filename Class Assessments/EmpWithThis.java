package Data.MyData;

public class EmpWithThis {

	int id;
	String name;
	float salary;
	void getData(int id,String name, float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
    void setDetails() {
    	System.out.println("Id="+id+"\nName="+name+"\nsalary="+salary);
    }
	public static void main(String[] args) {
		EmpWithThis e = new EmpWithThis();
		e.getData(123, "Rubi", 20000);
		e.setDetails();
	

	}

}
