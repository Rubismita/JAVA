package Exception;

public class SimplwException {

	public static void main(String[] args) {
		try{
			int Num1 = 25;
			int Num2 = 20%3;
			
			int div = Num1/Num2;
			System.out.println("Result : "+ div);
			
			}
		    catch(Exception e){
				System.out.println("Arithmetic Exception occurred in code");
			}
		finally{{
			System.out.println("After division");
			
		}

	}

	}
	}
