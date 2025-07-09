package vending_machine_ver1;

public class RestArea {
	String name;
	User user;
	VendingMachine machine;
	
	public RestArea() {
		this("평창");
	}
	public RestArea(String name) {
		this.name = name;
		user = new User("정국");
		welcome();
		machine = new VendingMachine(user);
	}
	
	public void welcome() {
		System.out.println("========================================");
		System.out.println("\t"+name+" 휴게소 자판기 입니다.");
		System.out.println("========================================");
	}
}
