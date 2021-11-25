package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {
public static void main(String[] args) {
	
	List<Employee> salaries = new ArrayList<>();
	salaries.add(new Employee(10, "Ronaldo", 1000000.0));
	salaries.add(new Employee(32, "Messi", 5000000.5));
	salaries.add(new Employee(45, "Raju", 4000000.8));
	salaries.add(new Employee(8, "Rakhi", 3000000.9));
	salaries.add(new Employee(12, "Vyankat", 2000000.3));
	
	Collections.sort(salaries);
	
	for(Employee e: salaries) {
		System.out.println(e.eid);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
}
}
