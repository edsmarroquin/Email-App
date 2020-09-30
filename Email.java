package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private int mailCapacity;
	private String email;
	private String companySuffix = "anycompany.com";
	private String password;
	private int defaultPasswordLength = 10;
	
	
	//constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//call a method asking for the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.print("Your Password is: " + this.password);
		
		//combine elements to create emails
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nENTER DEPARTMENT CODE: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "Sales"; }
		else if(depChoice == 2) { return "dev"; }
		else if(depChoice == 3) { return "acct"; }
		else { return ""; } 
	}
		
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rng = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rng);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	
	//set the alternate email
	
	//change the password
}