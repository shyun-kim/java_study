package lunch;

public class LunchOrderMenuManager {
	//Field
	LunchOrderSystemOOP system;
//	String[] lunchMenuNames;
//	int[] lunchMenuPrice;
	
	
	//Constructor
	public LunchOrderMenuManager() {	
	}
	public LunchOrderMenuManager(LunchOrderSystemOOP system) {
		this.system = system;
//		this.lunchMenuNames = lunchMenuNames;
//		this.lunchMenuPrice = lunchMenuPrice;
	}
	
	//Method
	//메인메뉴 출력
		public void showMainMenu() {
			System.out.println("*******************************************");
			System.out.println("\t Welcome to ["+system.title+"] Food Mart!");
			System.out.println("*******************************************");
			System.out.println("\t 1.음식 주문");
			System.out.println("\t 2.주문 내역");
			System.out.println("\t 3.음식 결제");
			System.out.println("\t 4.결제 내역");
			System.out.println("\t 9.프로그램 종료");
			System.out.println("*******************************************");
			
			selectMainMenu();
		}
		
	//메인메뉴 선택
	public void selectMainMenu() {
		System.out.print("메뉴를 선택하십시오> ");
		
		if (system.input.hasNextInt()) {
			mainMenuCheck(system.input.nextInt());
		} else {
			System.out.println("잘못된 입력입니다.");
			system.input.next();
			selectMainMenu();
		}
	}

	//런치메뉴 생성
	public void createLunchMenu() {
		for (int i=0;i<system.lunchMenuNames.length;i++) {
			LunchMenu menu = new LunchMenu();
			menu.no=i+1;
			menu.name=system.lunchMenuNames[i];
			menu.price = system.lunchMenuPrice[i];
			system.lunchMenuList[i] = menu;
		}
	}
		
	//런치메뉴 체크
	public void showLunchMenu() {
		for (LunchMenu menu : system.lunchMenuList) {
			System.out.print(menu.no+". ");
			System.out.print(menu.name+" \t");
			System.out.println(menu.price);
		}
		selectLunchMenu();
	}
		
	//런치메뉴 선택
	public void selectLunchMenu() {
		System.out.print("주문메뉴> ");
		if (system.input.hasNextInt()) {
			lunchMenuCheck(system.input.nextInt());
		} else {
			System.out.println("잘못된 입력입니다.");
			system.input.next();
			selectLunchMenu();
		}
	}	
			
			
	
	//메인메뉴 체크
	public void mainMenuCheck(int mainMenu) {
	switch (mainMenu) {
		case 1:
			showLunchMenu();
			break;
		case 2:
			system.orderList();
			break;
		case 3:
			system.payment();
			break;
		case 4:
			system.paymentList();
			break;
		case 9:
			System.out.println("--음식 주문 시스템을 종료합니다.--");
			System.exit(0);
			break;
		default:
			System.out.println("메뉴 준비중");
			showMainMenu();
	}
}
	
	//런치메뉴 체크
	public void lunchMenuCheck(int lunchMenu) {
		//lunchmenu 1~4 주문가능/ 다른번호 메뉴준비중, 다시 입력
		if (lunchMenu>=1&&lunchMenu<=4) {
			//주문진행 == > OrderItem객체 생성
			system.order(lunchMenu);
		} else {
			System.out.println("메뉴 준비중입니다.");
			showLunchMenu();
		}
	}
	
}
