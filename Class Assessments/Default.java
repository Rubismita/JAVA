package AccesModifiers;

public interface Default {
	void show();
	//static
	default void display() {
		System.out.println("Learning Default method in Interface");
	}
	

}
