package chapter21_miniproject.model;

public class CartVo {
	private String isbn;
	private int quantity;
	private int totalPrice;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totlaPrice) {
		this.totalPrice = totlaPrice;
	}
	
	
}
