package Maven_Pratical.LamdaExpresssionExamples;

public class Task1 {

	public static void main(String[] args) {
		
		Task2 tk=(a,b)->
				{
			return a+b;
				};
		System.out.println(tk.sum(10, 20));

	}

}
