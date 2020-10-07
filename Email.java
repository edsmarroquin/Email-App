package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private int mailboxCapacity = 500;
	private String email;
	private String companySuffix = "anycompany.com";
	private String password;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	
	
	//constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//call a method asking for the department
		this.department = setDepartment();

		
		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);

		
		//combine elements to create emails
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("New worker: " + firstName + ". DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nENTER DEPARTMENT CODE: ");
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
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String AltEmail) {
		this.alternateEmail = AltEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMAPNY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
