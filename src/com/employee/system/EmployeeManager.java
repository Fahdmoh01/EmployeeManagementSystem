package com.employee.system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeManager {
	public static void main(String[] args) {
		try {
			Employee emp = new Employee();
			Scanner sc = new Scanner(System.in);
			//File f= new File("EmployeeDB.txt");
			String filename = "EmployeeDB.dat";

			FileOutputStream fout = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fout);

			FileInputStream fint = new FileInputStream(filename);
			ObjectInputStream intt = new ObjectInputStream(fint);

			int choice = 0;
			do {

				System.out.println("************************************************");
				System.out.println("Select your Option");
				System.out.println("1.Add an Employee information.");
				System.out.println("2.Display all Employees information.");
				System.out.println("3. Exit");
				System.out.println("************************************************");

				choice = sc.hasNextInt() ? sc.nextInt() : 0;

				switch (choice) {
				case 1:
					System.out.println("Enter Employee name");
					emp.setEmp_name(sc.next());
					System.out.println("Enter Employee ID");
					emp.setEmp_id(sc.next());
					System.out.println("Enter Employee Designation");
					emp.setDesignation(sc.next());
					System.out.println("Enter Employee Salary");
					emp.setSalary(sc.nextDouble());
					out.writeObject(emp);
					break;
				case 2:
					System.out.println("The Employee Information will displayed as follows:");
					emp = null;
					while (fint.available() > 0) {
						emp = (Employee) intt.readObject();
						System.out.println(emp);
					}
					break;
				case 3:
					System.out.println("Thank you for using this DataBase");
					break;
				default:
					break;
				}
			} while (choice != 3);
			sc.close();
			fint.close();
			fout.close();
			out.close();
			intt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
