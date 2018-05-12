package budomain.swerproject;

public class Employee extends Person{
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
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + ", address: " +"\n city: "+ address.getCity() + "\n house number "+ address.getHouseNumber()+ " \n Street name " + address.getStreetName()+"]";
	}

}

