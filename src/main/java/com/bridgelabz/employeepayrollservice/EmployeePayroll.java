package com.bridgelabz.employeepayrollservice;

import java.util.Scanner;

public class EmployeePayroll {

	private Employee employee;
	private Scanner scanner;

	public EmployeePayroll() {
		scanner = new Scanner(System.in);
	}

	public void readEmployeePayroll() {
		System.out.print("Enter employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // consume newline character

		System.out.print("Enter employee name: ");
		String name = scanner.nextLine();

		System.out.print("Enter employee salary: ");
		double salary = scanner.nextDouble();

		employee = new Employee(id, name, salary);
	}

	public void writeEmployeePayroll() {
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee name: " + employee.getName());
		System.out.println("Employee salary: " + employee.getSalary());
	}

}
