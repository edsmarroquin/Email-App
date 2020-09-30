package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private int mailCapacity;
	private String password;
	
	//constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//call a method asking for the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nENTER DEPARTMENT CODE");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "Sales"; }
		else if(depChoice == 2) { return "dev"; }
		else if(depChoice == 3) { return "acct"; }
		else { return ""; }
	}
		
	//Generate a random password
	
	//set the mailbox capacity
	
	//set the alternate email
	
	//change the password
}
