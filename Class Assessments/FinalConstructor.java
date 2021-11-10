package Data.MyData;
class AAAA{
	//final 
	AAAA(){
		System.out.println("welcome");
	}
}

public class FinalConstructor  extends AAAA{
	FinalConstructor(){
		
		System.out.println("welcome java");
	}
	

	public static void main(String[] args) {
		FinalConstructor  fc =  new FinalConstructor();
		

	}

}
