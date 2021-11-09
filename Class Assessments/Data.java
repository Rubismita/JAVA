//nested interface
package Demo1;

public interface Showable {
	  void show();
	  interface Message{
	   void msg();

}
}


package Demo1;

public class Data implements Showable {

	
	public void show() {
		System.out.println("Welcome");
	}
	void msg() {
		System.out.println("Learn  Nested Interface");
	}
		

 public static void main(String args[]){
	 Data d = new Data();
	 d.show();
	 d.msg();
			  

	}

}
