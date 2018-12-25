
import java.util.Scanner;

// Make Email instance variable to be private = Encapsulation
public class Email {
	private String firstName;
	private String lastName;
	private static final int defaultPasswordLength = 5;
	private static final String company = "frostflux";
	private int mailboxCapacity = 500;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;

	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// Call a method asking for the department = Internal | must be private
		this.department = setDepartment();

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);

		// Combine elements to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + Email.company + ".com";
	}

	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODE");
		System.out.println("Enter the Depatment");
		System.out.println("1 for Sales");
		System.out.println("2 for Development");
		System.out.println("3 for Accounting");
		System.out.println("4 for None");
		System.out.print("Input: ");

		Scanner input = new Scanner(System.in);
		int deptChoice = input.nextInt();
		input.close();
		switch(deptChoice) {
			case 1:
				return "sales";
			case 2:
				return "dev";
			case 3:
				return "acc";
			default:
				return "";
		}
	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!#";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			// Generates Random number from 0 to passwordSet length
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set the mailbox capacity
	public void setMailboxCap(int size) {
		this.mailboxCapacity = size;
	}

	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }

	public void showInfo() {
		System.out.println("Display Name: " + firstName + " " + lastName + "\n Company Email: " + email + "\n Mailbox Capacity: " + mailboxCapacity);
	}
}
