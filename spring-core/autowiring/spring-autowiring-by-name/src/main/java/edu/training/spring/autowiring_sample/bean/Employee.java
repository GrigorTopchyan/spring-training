package edu.training.spring.autowiring_sample.bean;

public class Employee {
	
	private String fullName;
	private Department department;

	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", department=" + department + "]";
	}
}
