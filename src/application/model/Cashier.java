package application.model;

public class Cashier {
	private int id;
	private long socialSecurityNumber;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private long totalSale;

	public Cashier(int id, long socialSecurityNumber, String password, String firstName, String lastName, String email,
			long totalSale) {
		this.id = id;
		this.socialSecurityNumber = socialSecurityNumber;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.totalSale = totalSale;
	}

	public int getId() {
		return id;
	}

	public long getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(long socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTotalSale() {
		return totalSale;
	}

	public void setTotalSale(long totalSale) {
		this.totalSale = totalSale;
	}

	public String toString() {
		return ("Cashier:\nId: " + id + "\n" + "SocialSecurityNumber: " + socialSecurityNumber + "\n" + "Password: " + password
				+ "\n" + "Firstname: " + firstName + "\n" + "Lastname: " + lastName + "\n" + "Email: " + email + "\n"
				+ "TotalSale: " + totalSale);
	}

}
