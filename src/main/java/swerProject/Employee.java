package swerProject;


public class Employee extends Person {
	int salary;

	public Employee() {
		super();

	}

	public Employee(String name, int age, Address address,int salary) {
		super(name, age,address);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee  \nName: " + name + "\n Salary:" + salary + ",  \nAge: " + age  + address ;
	}


}