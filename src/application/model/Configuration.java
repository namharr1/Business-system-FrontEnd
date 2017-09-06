package application.model;

/*
 * This is just a placeholder for the systems configuration that creates on start
 * and gets the information from the sever.
 * */
public class Configuration {
	
	private long  storeId;
	private double currentTaxRate;
	private String storeName;
	private String storeAdress;
	
	public Configuration(long storeId, double currentTaxRate, String storeName, String storeAdress) {
		
		
		this.storeId = storeId;
		this.currentTaxRate = currentTaxRate;
		this.storeName = storeName;
		this.storeAdress = storeAdress;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public double getCurrentTaxRate() {
		return currentTaxRate;
	}

	public void setCurrentTaxRate(double currentTaxRate) {
		this.currentTaxRate = currentTaxRate;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAdress() {
		return storeAdress;
	}

	public void setStoreAdress(String storeAdress) {
		this.storeAdress = storeAdress;
	}
	
	public String toString(){
		
		return ("Store ID: " + storeId + "\n" + "Current Tax Rate: " + currentTaxRate + "\n" + " Store Name: " + storeName + "\n" + " Store Adress: " + storeAdress);
	}
	
	

}
