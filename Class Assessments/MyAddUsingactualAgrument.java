package Method;

public class MyAddUsingactualAgrument {
	//with passing without returning
	void add(int x , int y) {
		int sum=x+y;
		System.out.println("Sum of numbers:"+sum);
	}

	public static void main(String[] args) {
		
		MyAdd md = new MyAdd();
		md.add(4, 9);

	}

}
