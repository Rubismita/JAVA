package Data.MyData;

public class ThisInConstructor {
	String name;
	ThisInConstructor(){
		System.out.println("Welcome to this constructor");
	}
	ThisInConstructor(String name){
		this();
		System.out.println("Name="+name);
	}

	public static void main(String[] args) {
		ThisInConstructor tc = new ThisInConstructor("Rubi");

	}

}
