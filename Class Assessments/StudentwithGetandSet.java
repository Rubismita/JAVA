package Data.MyData;

public class StudentwithGetandSet {
	 private int id;
	String name;
	float marks;
	public void setId(int i) {
		id=i;
	}
	int  getId() {
		return id;
	}

	public static void main(String args[]) {
		StudentwithGetandSet  s = new StudentwithGetandSet ();
		//s.setId(12);
		s.id=23;
		s.setId(12);
		System.out.println(s.getId());
	}
}