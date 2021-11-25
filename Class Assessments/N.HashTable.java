package Collections;
import java.util.Hashtable;
import java.util.Map;

public class N {
	
	

		public static void main(String[] args) 
		{
			//  write a java prgm to print employee id and name using HashTable collection framework.
		Hashtable<Integer  , String > map = new Hashtable<Integer  , String >();
			
	             map.put(111, "Rubismita");
	             map.put(222,"Alisha");
	             map.put(333, "Rehana");
	             map.put(111, "Sravani");
	             map.put(333,"Rubismita");
			
			for( Map.Entry<Integer, String> map1 : map.entrySet())
			{
				System.out.println(map1.getKey() + " - " + map1.getValue());
			}
		}

	}


