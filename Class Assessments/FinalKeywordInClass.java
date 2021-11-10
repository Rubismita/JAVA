package Data.MyData;
 final class AAA{
			final void show() {
		System.out.println("welcome");

	}
}

public class FinalKeywordInClass //extends AAA
{
	final void show() {
		System.out.println("welcome java");
	}

public static void main(String args[]) {
	FinalKeywordInClass fc = new FinalKeywordInClass();
	fc.show();
}
}