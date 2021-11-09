package Data.MyData;

public class MethodOverloading {
	void data() {
		System.out.println("Hello");
	}
	void data(int x) {
		System.out.println("Hello Everyone"+ " "+x);
	}

     void data(int x , int y) {
	       System.out.println("Hello Everyone , Welcome to Java"+ " "+(x+y));
     }
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.data();
		mo.data(2);
		mo.data(3, 4);	
	}

}
