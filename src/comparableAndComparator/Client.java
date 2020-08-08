package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(10023);
		e1.setEmpName("Kartikey");
		e1.setEmpSalary(150000);
		
		Employee e2 = new Employee();
		e2.setEmpId(12323);
		e2.setEmpName("Mukul");
		e2.setEmpSalary(105000);
		
		Employee e3 = new Employee();
		e3.setEmpId(02323);
		e3.setEmpName("Rishabh");
		e3.setEmpSalary(190100);
			
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		Collections.sort(empList, new EmployeeEmpIdComparator());
		System.out.println("By empID Comparator");
		for(Employee emp: empList) {			
			System.out.println(emp.getEmpId()+" : "+ emp.getEmpSalary()+" : "+emp.getEmpName());
		}
		System.out.println("*****************************");
		
		Collections.sort(empList, new EmployeeEmpSalarayComparator());
		System.out.println("By empSalary Comparator");
		for(Employee emp:empList) {
			System.out.println(emp.getEmpId()+" : "+ emp.getEmpSalary()+" : "+emp.getEmpName());
		}
		System.out.println("*****************************");
		
		Collections.sort(empList, new EmployeeEmpNameComparator());
		System.out.println("By empName Comparator");
		for(Employee emp:empList) {
			System.out.println(emp.getEmpId()+" : "+ emp.getEmpSalary()+" : "+emp.getEmpName());
		}
		System.out.println("*****************************");
		
		Collections.sort(empList);
		System.out.println("By empID Comparable");
		for(Employee emp:empList) {
			System.out.println(emp.getEmpId()+" : "+ emp.getEmpSalary()+" : "+emp.getEmpName());
		}
		
				
	}

}
