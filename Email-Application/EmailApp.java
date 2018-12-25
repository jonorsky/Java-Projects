
public class EmailApp {
	public static void main(String[] args) {
		Email em1 = new Email("John","Smith");
		em1.setAlternateEmail("johnsmith@gmail.com");
		em1.setMailboxCap(400);
		em1.changePassword("heyo123");
		em1.showInfo();
	}
}
