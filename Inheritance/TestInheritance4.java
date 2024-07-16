
// Write a Java program to create a class called Employee with methods called work() and getSalary().
//Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
package Inheritance;

class Employee{
	private int sal;
	Employee(int sal){
		this.sal = sal;
	}
	void work() {
		System.out.println("Employees work");
	}
	
	public int getSalary() {
		return sal;
	}
}

class HRManager extends Employee{

	HRManager(int sal) {
		super(sal);
		// TODO Auto-generated constructor stub
	}
	
	void work() {
		System.out.println("Job is to hire Managers");
	}
	
	public void addEmployee() {
		System.out.println("Adding new Employees");
	}
	
}

public class TestInheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating an employee object with salary 45000
		Employee emp1 = new Employee(45000);
		emp1.work();
		System.out.println("Salary of Employee is "+emp1.getSalary());
		
		System.out.println("");
		//creating a HRManager object with salary 35000
		HRManager hrm1 = new HRManager(35000);
		hrm1.work();
		System.out.println("Salary of HRManager is "+hrm1.getSalary());
		hrm1.addEmployee();
	}

}
