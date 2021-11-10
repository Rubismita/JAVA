package Data.MyData;
class AA{
	final void show() {
		System.out.println("welcome");
		
	}
}

public class FinalMethod //extends AA
{
	void show() {
		System.out.println("welcome java");
		
	}

	public static void main(String[] args) {
		FinalMethod fm = new FinalMethod();
		fm.show();

	}

}
