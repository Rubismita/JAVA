package Data.MyData;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("Welcome");
	}
	ConstructorOverloading(int x){
		this();
		System.out.println("Number =" + " "+x);
	}
	ConstructorOverloading( int x , int y){
		System.out.println("Addition ="+" "+(x+y));
	}
	ConstructorOverloading(String name){
		System.out.println("Name ="+" "+name);
	}

	public static void main(String[] args) {
		//ConstructorOverloading co= new ConstructorOverloading();
		ConstructorOverloading co1= new ConstructorOverloading(5);
		//ConstructorOverloading co2= new ConstructorOverloading(2,3);
		//ConstructorOverloading co3= new ConstructorOverloading("Rubi");		
	}

}
