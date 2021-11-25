  
package Exception;

public class ArrayException {
	public static void main(String args[]) {
		try {
	      int arr[] = {10, 20, 30, 40};
	      System.out.println(arr[6]);
	   }
		catch(Exception e) {
			System.out.println("You are going beyond the limit");
		}
		finally {
			System.out.println("Program Completed");
		}
	}

}
