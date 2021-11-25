package AccesModifiers;

public class DefaultClass implements Default {
	public void show() {
		System.out.println("Learning Default method");
	}
public static void main(String args[]) {
	DefaultClass dc = new DefaultClass();
	dc.show();
	dc.display();
	//Default.display(); op-Learning Default method in Interface

}
}
