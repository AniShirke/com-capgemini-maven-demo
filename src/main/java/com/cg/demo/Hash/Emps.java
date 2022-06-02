package com.cg.demo.Hash;

public class Emps {

	public static void main(String[] args) {

		EmpD emp = new EmpD(101, "Sonu", 50000);

		EmpD emp2 = new EmpD(102, "Monu", 55000);
//		Employee emp2 = new Employee(101, "Sonu", 50000);

		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());

		System.out.println(emp.equals(emp2));

	}

}