package Data.MyData;

public class EmpWithoutThis {
	int id;
	String name;
	float salary;
	void getData(int i,String s, float f) {
		id=i;
		name=s;
		salary=f;
	}
    void setDetails() {
    	System.out.println("Id="+id+"\nName="+name+"\n salary="+salary);
    }
	public static void main(String[] args) {
		EmpWithoutThis e = new EmpWithoutThis();
		e.getData(123, "Rubi", 20000);
		e.setDetails();
	

	}

}
