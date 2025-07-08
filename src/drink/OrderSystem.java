package drink;

import java.util.Scanner;

import commons.Menu;

public class OrderSystem {
	//Field
	Scanner scan = new Scanner(System.in);
	String title;
	int title2;
	String names[] = {"☕아메리카노","🍵바닐라 라떼","🥤딸기 쉐이크"};
	int price[] = {2800,3500,4000};
	Menu menuList[]=new Menu[names.length];
	Order order;
	Payment payment;
	
	//Constructor
	public OrderSystem() { //여기서 this(int)를 주고 인트 값 생성자에 init 안주면 실행 안되나?
		this("mega");
//		this(1);
//		init();
	};
	public OrderSystem(String title) {
		this.title = title;
		init();
	};
	public OrderSystem(int title2) {
		this.title2 = title2;
		System.out.println("init 없음");
	};
	
	
	//Method
	public void init() {
		payment = new Payment();
		createMenuList();
		showMenu();
		selectMenu();
	}
	
	public void createMenuList() {
		for (int i=0; i<names.length; i++) {
			Menu menu=new Menu((i+1),names[i],price[i]);
			menuList[i]=menu;
		}
	}
	//createMenuList로 Menu 클래스로 매개변수를 보내주고 Menu 클래스에서 생성자로 각 변수들에 값 넣어줌
	
	public void showMenu() {
		System.out.println("=======================================");
		System.out.println("\t☕🍵🥤"+title+" Coffee menu");
		System.out.println("=======================================");
		for (Menu menu : menuList) {
			System.out.print(menu.no+".\t");
			System.out.print(menu.name+"\t");
			System.out.println(String.format("%,d", menu.price)+"\t");
		}
//		for (int i=0;i<menuList.length; i++) {
//			Menu menu = menuList[i];
//			System.out.println(menu.no+".\t");
//			System.out.println(menu.name+".\t");
//			System.out.println(menu.price+".\t");
//		}
	}
	
	// 메뉴 선택
	public void selectMenu() {
		System.out.print("주문할 메뉴 번호 입력(숫자)> ");
		if (scan.hasNextInt()) {
			int menu = scan.nextInt();
			if (menu>=1 && menu<=3) {
				placeOrder(menu);
			} else {
				System.out.println("==메뉴 준비중.==");
			}
		} else {
			System.out.println("올바르지 않은 입력값 입니다. 다시 입력해 주십시오.");
			scan.next();
			selectMenu();
		}
		
	}
	
	public Menu searchMenu(int menuNo){
		//번호에 맞는 메뉴를 메뉴리스트에서 검색한다. 검색한 메뉴를 order 생성자에 매개변수로 입력.
		Menu menu = null; //타입이 Menu타입이라 메뉴타입으로 잡아줘야 함 
		
		for (Menu m: menuList) { //menuList[0] --> m으로 입력됨 --> Menu(.name 아메리카노)
			if (m.no == menuNo) {
				menu = m;
				break;
			}
		}
		return menu;
	}
	
	//주문 기능
	public void placeOrder(int menu) {
		//order = new Order(menuList[menu-1]); 
		//이미 메뉴리스트에 메뉴클래스(메뉴타입)이 들어가 있지만 메소드를 반복해서 사용하기 위해 searchMenu() 사용
		order = new Order(searchMenu(menu));
		if (order.orderMenu != null) {
			order.getInfo();
		}
		System.out.println("=> 주문 완료");
		processPayment();
	}

	//결제
	public void processPayment() {
		System.out.print("결제할 금액 입력> ");
		if (scan.hasNextInt()) {
			payment.setAmount(scan.nextInt());
			System.out.println("=> 총 입금금액: "+String.format("%,d", payment.getAmount()));
			if(payment.getPayment(order.orderMenu.price)) {
				//결제 완료
				System.out.println("=>결제완료! 잔돈: "+String.format("%,d",payment.getChange()));
				//잔돈 없을때 잔돈 안보여주기는 if문으로
			} else {
				//금액 부족
				System.out.println("금액이 부족합니다. 다시 입력해 주십시오");
				processPayment();
			}
		} else {
			System.out.println("잘못된 입력입니다. 다시 입력해 주십시오.");
			scan.next();
			processPayment();
		}
		
	}
}
