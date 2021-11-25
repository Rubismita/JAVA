package Exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			String s="Rubi";
			System.out.println(s.length());
			int arr[]= {1,2,3};
			System.out.println(arr[7]);
			int x=4;
			int y=0;
			int z=x/y;
			System.out.println(z);
		}
		catch(NullPointerException | ArithmeticException  e) {
			System.out.println("You have Exception is caught");
		} 
		
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Completed");

	}

}
}
