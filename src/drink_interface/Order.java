package drink_interface;

public class Order {
	//Field
	Menu orderMenu;
	
//	String menuName;
//	int menuNo;
//	int amount=0;
//	int qty=0;
	
	//Constructor
	public Order() {}
	public Order(Menu menu) {
		this.orderMenu=menu;
	}
	
	//Method
	public String getName() {
		return orderMenu.getName();
	}
	public int getTotal() {
		return orderMenu.getPrice();
	}
	public void getInfo() {
		String price = String.format("%,d", orderMenu.getPrice());
		System.out.println("=> 주문 메뉴: "+orderMenu.getName()+", 결제 예정 금액: "+price+"원");
	}
	
}
