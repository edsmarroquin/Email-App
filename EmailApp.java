package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email("john","Smith");
		
		System.out.println(em1.showInfo());
		
		//displays new mailbox capacity 
		/*em1.setMailboxCapacity(300);
		System.out.println("New mailbox capacity: " + em1.getMailboxCapacity());
		*/
		
		//displays alternate email
		/*em1.setAlternateEmail("jsmith@hotmail.com");
		System.out.println("Alternate Email: " + em1.getAlternateEmail());
		*/
		 
		//displays new password
		/*em1.changePassword("qwerty123");
		System.out.println("changed password: " + em1.getPassword());
		*/
	}

}
