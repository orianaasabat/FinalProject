package swerProject;

public class Student extends Person {
	int grade;
	 

	public Student() {
		super();
	}

	public Student(String name, int age, Address address, int grade) {
		super(name, age, address);
		this.grade = grade;

	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + "]";
	}

}