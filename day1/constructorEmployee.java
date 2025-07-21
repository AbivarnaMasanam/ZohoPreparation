package zohocodeing;

import java.util.Scanner;

/*Write a class Employee with attributes empId, name, department and
		salary and define a parametrized constructor Employee(int empId, String 
		name, String department, double salary) and assign these 
		variables to instance variables accordingly and display them*/
class Employee {
	int empId;
	String name;
	String department;
	double salary;

	Employee(int empId, String name, String department, double salary) {
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;

	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

}

public class constructorEmployee{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee obj = new Employee(01, "ABI", "SDE", 500000);
		System.out.println(obj.getEmpId());
		System.out.println(obj.getName());
		System.out.println(obj.getDepartment());
		System.out.println(obj.getSalary());
		scan.close();
	}

}
