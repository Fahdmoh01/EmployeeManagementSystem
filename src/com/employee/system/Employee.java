package com.employee.system;

import java.io.Serializable;

public class Employee implements Serializable{

	private String emp_name;
	private String emp_id;
	private String designation;
	private double  salary;

	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	
}
