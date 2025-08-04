package chapter21_miniproject.service;

public interface ProjectServiceInterface {
	public void showList();
	public void checkCustomer();
	public void checkShoppingCart();
	public void resetShoppingCart();
	public void searchItemShoppingCart();
	public void addItemShoppingCart(String bid);
	public void reduceItemShoppingCart();
	public void deleteItemShoppingCart();
	public void showReceipt();
	public void close();
	
}
