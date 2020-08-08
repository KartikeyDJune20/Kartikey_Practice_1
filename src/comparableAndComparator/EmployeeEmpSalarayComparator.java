package comparableAndComparator;

import java.util.Comparator;

public class EmployeeEmpSalarayComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpSalary()== o2.getEmpSalary()) 
			return 0;
		else if(o1.getEmpSalary()>o2.getEmpSalary())
			return 33;
		else
			return -33;
	}

}
