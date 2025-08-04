package chapter21_miniproject.service;

public class ProjectService implements ProjectServiceInterface{
	
	public void checkCustomer(){
		System.out.println("1");
	}
	public void checkShoppingCart() {
		System.out.println("2");
	}
	public void resetShoppingCart() {
		System.out.println("3");
	}
	public void addItemShoppingCart() {
		System.out.println("4");
	}
	public void reduceItemShoppingCart() {
		System.out.println("5");
	}
	public void deleteItemShoppingCart() {
		System.out.println("6");
	}
	public void showReceipt() {
		System.out.println("7");
	}
	public void close() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
