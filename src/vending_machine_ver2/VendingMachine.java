package vending_machine_ver2;

import commons.Menu;

public class VendingMachine {
	//Field
	User user;
	String title;
	int totalCoin;
	int change;
	
	
	String name[]= {"☕ 밀크커피", "☕ 아메리카노","🍋 유자차   ","🥛 초코우유  "};
	int price[] = {300,400,300,200};
	Menu menuList[];
	Menu canOrderList[];

	//Constructor
	
	
	//Method
	public VendingMachine() {}
	public VendingMachine(User user) {
		this("Compose",user);
	}
	public VendingMachine(String title, User user) {
		this.title=title;
		this.user=user;
		createMenuList();
		mainMenuPrint();
		coinInsert();
	}
	
	
	//메뉴리스트 생성
	public void createMenuList() {
		menuList=new Menu[name.length];
		for (int i=0; i<name.length; i++) {
			int no=i+1;
			String name=this.name[i];
			int price=this.price[i];
			
			Menu menu = new Menu(no, name, price);
			menuList[i]=menu;
		}
	}
	
	//메뉴판 출력
	public void mainMenuPrint() {
		System.out.println("==="+title+" 메뉴판===");
		for (int i=0; i<menuList.length;i++) {
			System.out.println(menuList[i].no+". "+menuList[i].name+" - "+menuList[i].price+"원");
		}
		
	}
	
	public void coinInsert() {
		totalCoin = user.insertedCoinCheck();
		System.out.println("투입하신 금액: "+totalCoin);
		if (totalCoin < menuList[3].price) { //만약 제일 싼 메뉴보다 토탈 코인이 적으면?
			coinInsert();
		} else {
			askOrder("주문");
		}
	}
	
	public void askOrder(int i) {
		System.out.print("다시 주문 하시겠습니까?(y/n)> ");
		String chk = user.scan.next();
		if (chk.equals("y")) {
			showCanOrderMenu();
		} else if (chk.equals("n")) {
			exit();
		} else {
			System.out.println("잘못된 입력입니다.");
			askOrder(0);
		}
	}
	public void askOrder(double i) {
		System.out.print("다시 주문 하시겠습니까?(y/n)> ");
		String chk = user.scan.next();
		if (chk.equals("y")) {
			showCanOrderMenu();
		} else if (chk.equals("n")) {
			coinInsert();
		} else {
			System.out.println("잘못된 입력입니다.");
			askOrder(0);
		}
	}
	public void askOrder(String text) {
		System.out.print(text+" 하시겠습니까?(y/n)> ");
		String chk = user.scan.next();
		if (chk.equals("y")) {
			showCanOrderMenu();
		} else if (chk.equals("n")) {
			coinInsert();
		} else {
			System.out.println("잘못된 입력입니다.");
			askOrder("주문");
		}
	}
	
	public void showCanOrderMenu() {
		//totalCoin이랑 비교해서 주문 가능한 금액만 보여주기
		System.out.println("====주문 가능한 항목====");
		
		for (int i=0; i<menuList.length;i++) {
			if (menuList[i].price <= totalCoin) {
				System.out.print(menuList[i].no+". \t");
				System.out.print(menuList[i].name+"\t");
				System.out.println(menuList[i].price);
			}
		}
		makeOrder(user.menuSel());
	}
	
	public void makeOrder(int menuSel) {
		//토탈코인에서 메뉴리스트[메뉴셀-1].프라이스 빼고 나머지 보여주기 
		int minPrice=menuList[3].price; //메뉴중 가장 저렴한 초코유우 가격
		System.out.println("===주문 항목===");
		System.out.print(menuList[(menuSel-1)].no+". \t");
		System.out.print(menuList[(menuSel-1)].name+"\t");
		System.out.println(menuList[(menuSel-1)].price);
		change=totalCoin-menuList[(menuSel-1)].price;
		System.out.println("잔돈은 "+change+"원 입니다.");
		totalCoin =change;
		
		if (change>=minPrice) {
			askOrder(1.1);
		} else {
			System.out.println("==감사합니다==");
			exit();
		}
	}
	
	public void exit() {
		System.exit(0);
	}
	
	
	
}
