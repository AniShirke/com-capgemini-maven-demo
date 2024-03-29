package com.capgemini.demo.comp;

public class Employee implements Comparable<Employee> {

	private int eid;
	private String name;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	// order by eid
	@Override
	public int compareTo(Employee emp) {
		System.out.println("compareTo");
		return this.eid - emp.eid;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}