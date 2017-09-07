package application.model;

/*
 * Account validation for login. To send to the server for validation.
 * */
public class AccountValidation {
	
	private long socialSecurityNumber;
	private String password;
	private String accountStatus;
	
	public AccountValidation(long socialSecurityNumber, String password, String accountStatus) { 
		this.socialSecurityNumber = socialSecurityNumber;
		this.password = password;
		this.accountStatus = accountStatus;
		
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

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	
	public String toString() {
		
		return ("AccountValidation:\nSocialSecurtyNumber: " +socialSecurityNumber + "\nPassword: " + password + "\nAccountStatus:" + accountStatus);
	}

}

