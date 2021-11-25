package Exception;

public class MultipleExceptionInOneTryblock {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			int arr[]= {1,2,3};
			System.out.println(arr[5]);
			int x=4;
			int y=0;
			int z=x/y;
			System.out.println(z);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Completed");
		}

	}

}
