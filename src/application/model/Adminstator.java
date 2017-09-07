package application.model;

public class Adminstator {
	
	private long socialSecurityNumber;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	public Adminstator(long socialSecurityNumber, String firstName, String lastName, String password, String email) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
public String toString() {
		
		return ("Adminstator:\nSocialSecurtyNumber: " +socialSecurityNumber + "\nFirstName: " + firstName + "\nLastName:" + lastName + "\nPassword: " + password + "\nEmail : " + email);
	}
}

