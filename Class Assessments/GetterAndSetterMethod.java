package Data.MyData;

public class GetterAndSetterMethod {
	private int id;
	private String name;
	private float marks;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
		GetterAndSetterMethod gs = new GetterAndSetterMethod();
		gs.setId(10);
		gs.setName("Rubi");
		gs.setMarks(89);
		System.out.println(gs.getId());
		System.out.println(gs.getName());
		System.out.println(gs.getMarks());
	}

}
