package application.model;

/*
 * Customers that are members , to get extra bonuses etc.
 * */
public class Member {
	
	private long id;
	private long socialSecurityNumber;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private long totalSpent;
	private int totalPurchases;
	
	public Member (long id, long socialSecurityNumber, String firstName, String lastName, String email, String address, long totalSpent, int totalPurchased) {
			this.id = id;
			this.socialSecurityNumber = socialSecurityNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.address = address;
			this.totalSpent = totalSpent;
			this.totalPurchases = totalPurchased;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(long socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(long totalSpent) {
		this.totalSpent = totalSpent;
	}

	public int getTotalPurchases() {
		return totalPurchases;
	}

	public void setTotalPurchases(int totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	

	public String toString() {
		return ("Member:\nId: " + id +"\nSocail Security Number: " + socialSecurityNumber + 
				"\nFirstname: " + firstName + "\nLastname: " + lastName + "\nEmail: " 
				+ email + "\nAddress: " + address + "\nTotal Spent: " + totalSpent 
				+ "\nTotal Purchases:" + totalPurchases);
	}
}
