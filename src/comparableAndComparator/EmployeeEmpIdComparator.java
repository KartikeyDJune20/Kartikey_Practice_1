package comparableAndComparator;

import java.util.Comparator;

public class EmployeeEmpIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId()==o2.getEmpId())
		return 0;
		else if(o1.getEmpId()>o2.getEmpId())
			return 35;
		else
			return -33;
	}

}
