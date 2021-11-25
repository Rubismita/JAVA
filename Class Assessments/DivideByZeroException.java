package Exception;

public class DivideByZeroException {

	public static void main(String[] args) {
		try {
			int x=5;
			int y=0;
			int z=x/y;
			System.out.println(z);
		}
		catch(Exception e) {
			//System.out.println("DivideByZero Exception");
			System.err.println("DivideByZero Exception");
		}
		finally {
			System.out.println("DivideByZero Exception");
			
		}

	}

}
