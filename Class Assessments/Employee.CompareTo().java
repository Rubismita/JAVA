package Compare;
public class Employee implements Comparable<Employee> {

	int eid;
	String name;
	double salary;

	public Employee(int eid, String name, double salary) {

		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e1) {
		/*if (salary == e1.salary) {
			return 0;
		} else if (salary > e1.salary) {
			return 1;
		} else {
			return -1;
		}*/
		if (eid == e1.eid) {
			return 0;
		} else if (eid > e1.eid) {
			return 1;
		} else {
			return -1;
		}
	}

}
