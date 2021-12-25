package com.interview.preparation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*find  how many number of times a word or a number got repeated using Legacy Way
* input:5,3,4,1,3,7,2,9,9,4
* output:1-1,2-1,3-2,4-2,5-1,7-1,9-2
* 
* input:"Rubi","Mamali","Smita","Mamali","Rubi"
* 
*/

public class FinfDuplicateUsingLegacyWay {

	public static void main(String[] args) {
		
		 List<String> strlist = (List<String>) Arrays.asList( "Rubi","Mamali","Smita","Mamali","Rubi");
		 List<Integer> numlist = (List<Integer>) Arrays.asList( 5,3,4,1,3,7,2,9,9,4);
		 
		 Map<String,Integer> out=new HashMap<>() ;
			for(String s:strlist) {
				if(out.containsKey(s)) {
					int count=out.get(s);
					count++;
					out.put(s, count);
				}
				else {
					out.put(s, 1);
				}
			}
		     out.forEach((key,value) ->{
		   	  
			System.out.println(key + " -" +value)  ;
		     });
		     
		     Map<Integer,Long> out1=new HashMap<>() ;
				for(Integer s:numlist) {
					if(out1.containsKey(s)) {
						Long count=out1.get(s);
						count++;
						out1.put(s, count);
					}
					else {
						out1.put(s, (long) 1);
					}
				}
			     out1.forEach((key,value) ->{
			   	  
				System.out.println(key + " -" +value)  ;
			     });


	}

}
