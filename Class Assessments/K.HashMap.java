package Collections;
import java.util.HashMap;
import java.util.Map;

public class K {
	

		public static void main(String[] args) 
		{
			//  write a java prgm to print employee dept id and name using HashMap collection framework.
			HashMap<Integer , String> map = new HashMap<Integer , String>();
			
			map.put(23, "CSE");
			map.put(21, null);
			map.put(null, "ME");
			map.put(20, null);
			map.put(23, "CSE");
			System.out.println(map.keySet());
			
			
			for( Map.Entry<Integer, String> map1 : map.entrySet())
			{
				System.out.println(map1.getKey() + "  - " + map1.getValue());
			}
			
		}

	}


