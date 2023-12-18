// Write a program to take employee information using scanner like employee id, employee name, employee salary, employee address ,employee contact, employee gender(char)

import java.util.Scanner;
public class Employee
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee name ");
		String Employeename = sc.next();
		
		System.out.println("Enter Employee ID");
		int EmployeeID = sc.nextInt();
		
		System.out.println("Enter Employee Salary");
		int EmployeeSalary = sc.nextInt();
		
		System.out.println("Enter Employee ContactNumber ");
		String EmployeeContactNumber = sc.next();
		
		System.out.println("Enter Employee Address");
		String EmployeeAddress = sc.next();
		
	}
}
        
		
		
		
		
