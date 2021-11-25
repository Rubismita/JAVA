package Collections;


import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		 
        Stack<Integer> val2 = new Stack<Integer>();
        val2.add(1);
        val2.add(10);
        val2.add(6);
        val2.add(30);
        val2.add(54);
        val2.add(42);
        val2.add(94);
        val2.add(1);
        System.out.println(val2.push(3));
        System.out.println();
        System.out.println(val2.pop());
        System.out.println();
        System.out.println(val2.search(6));
        System.out.println();
        System.out.println(val2.peek());
        System.out.println();
        System.out.println(val2.empty());
        System.out.println();
        System.out.println(val2.indexOf(10));
        System.out.println();
        System.out.println(val2.capacity());
        System.out.println();
        System.out.println(val2.search(100));
        System.out.println();
        System.out.println(val2.clone());
        System.out.println();
        System.out.println(val2.hashCode());
        System.out.println();
        
        for(int i : val2)
        {
  	   	  System.out.println(i);
  		}

	}

}
