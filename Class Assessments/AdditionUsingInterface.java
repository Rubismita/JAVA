package Interface;

public interface Addition {
	
	void add() ;
		
	

}
--------------------------------------
package Interface;

public class AdditionUsingInterface implements Addition {
	 
		public void add() {
			int x=10;
			int y=20;
			int z=x+y;
			System.out.println("Addition of X and Y = "+z);
		}
		 public static void main(String args[]) {
			 AdditionUsingInterface d = new AdditionUsingInterface();
			 d.add();
		 }

}
