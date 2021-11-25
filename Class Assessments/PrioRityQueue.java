package Collections;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		//Collection val=new PriorityQueue();
		//Queue val= new PriorityQueue();
		PriorityQueue<Integer> val = new PriorityQueue<Integer>();
		val.add(2);
		val.add(3);
		val.add(4);
		
		System.out.println(val.contains(2));
		System.out.println();
		System.out.println(val.offer(6));
		System.out.println();
		System.out.println(val.size());
		System.out.println();
		System.out.println(val.isEmpty());
		System.out.println();
		System.out.println(val.peek());
		System.out.println();
		System.out.println(val.poll());
		System.out.println();
		System.out.println(val.remove(4));
		System.out.println();
		
		
		for( int i : val) {
			System.out.println(i);
		}
		
		

	}

}
