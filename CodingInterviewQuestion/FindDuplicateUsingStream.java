package com.interview.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*find  how many number of times a word or a number got repeated using stream
 * input:5,3,4,1,3,7,2,9,9,4
 * output:1-1,2-1,3-2,4-2,5-1,7-1,9-2
 * 
 * input:"Rubi","Mamali","Smita","Mamali","Rubi"
 * 
 */

public class FindDuplicateUsingStream {

	public static void main(String[] args) {
        List<Integer> numlist = (List<Integer>) Arrays.asList( 5,3,4,1,3,7,2,9,9,4);
        
        List<String> strlist = (List<String>) Arrays.asList( "Rubi","Mamali","Smita","Mamali","Rubi");
        
 
        Map<Integer,Long> output= numlist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
      output.forEach((key,value) -> {
    	  System.out.println(key + " -" +value)  ;
      });
      
      
      Map<String,Long> output1= strlist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      output1.forEach((key,value) -> {
    	  System.out.println(key + " -" +value)  ;
      });
	}
	

}

