package Data.MyData;

public class FinalVariable {
	final int a=2;
	void show() {
	//	a=5;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();
		fv.show();
	

	}

}
