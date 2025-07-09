package vending_machine_ver2;

public class RestArea {
	//Field
	User user=new User();
	String name;
	String userName;
	VendingMachine vmachine;
	
	//Constructor
	public RestArea() {
		this("더조은");
	}
	public RestArea(String name) {
		this.name=name;
		System.out.print("이름을 입력해 주세요> ");
		userName=user.scan.next();
		user = new User(userName);
		welcome();
		vmachine = new VendingMachine(user);
	}
	
	//Method
	public void welcome() {
		System.out.println("========================================");
		System.out.println("\t\t"+name+" 휴게소");
		System.out.println("========================================");
	}
}
