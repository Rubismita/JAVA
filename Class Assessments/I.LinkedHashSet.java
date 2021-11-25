package Collections;

import java.util.LinkedHashSet;

public class I {



	//write a java program to print all employee salaries by using LinkedHashSet 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Double> lhs=new LinkedHashSet<Double>();
		lhs.add(6078.0);
		lhs.add(757.0);
		lhs.add(83546.0);
		lhs.add(979.0);
		lhs.add(14667.0);
		lhs.add(9887.0);
		for(Double i:lhs ){
			System.out.println(i);
		}
	}

}


