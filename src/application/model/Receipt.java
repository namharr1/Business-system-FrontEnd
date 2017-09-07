package application.model;

import java.util.ArrayList;

public class Receipt {
	
	private long id;
	private Member member;
	private double price;
	private double taxPrice;
	private double finalPrice;
	private ArrayList<Item> itemList;

	
	public Receipt(long id, Member member, double price, double taxPrice, double finalPrice) {
		
		this.id = id;
		this.member = member;
		this.price  = price;
		this.taxPrice = taxPrice;
		this.finalPrice = finalPrice;
		this.itemList = new ArrayList<Item>();
		
			
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTaxPrice() {
		return taxPrice;
	}

	public void setTaxPrice(double taxPrice) {
		this.taxPrice = taxPrice;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	// Add new Item to Array
	public void addItemToList (Item item) {
		itemList.add(item);
	}
	
	//Delete Item
	
	public void deleteItem(Item item){
		int i = 0;
		
		while (i < itemList.size()){
			if (itemList.get(i).getId() == item.getId()){
				itemList.remove(i);
			}
			i ++;		
		}
		
	}
	
	// Get Number of items in List
	public int getNumberOfItems(){
		return itemList.size();
		
	}
	
	//Get member name
	
	public String getMemberName(){
		return (member.getFirstName() + " " + member.getLastName());
	}
	
	//Get price of items
	
    public double getPriceOfItems(){
		double price = 0;
		
		for(int i = 0; i < itemList.size(); i++) {
		    price = price += itemList.get(i).getPrice();
		     
		}
		
		return price;
	}
	
	public String toString() {
		return ("Reciept:\nID" + id + "member: " + member + " \n " + " price: " + price + "\n" 
	+ " taxPrice: " + taxPrice + "\n" + " finalPrice: " + finalPrice);
		
	}
	
	

	

}
