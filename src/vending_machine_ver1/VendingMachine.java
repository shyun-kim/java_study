package vending_machine_ver1;

import commons.Menu;

public class VendingMachine {
	String title;
	User user;
	int totalCoin;
	int change;
	int orderMenuCount=0;
	
	public final static int EXIT = 9;
	
	String nameList[]={"☕ 밀크커피", "☕ 아메리카노", "🍋 유자차  ", "🥛 초코우유 "};
	int priceList[]={300,400,300,200};
	Menu menuList[]; //user가 주문가능한 메뉴 != menuList
	Menu orderMenuList[];

	Menu orderMenu;
	
	public VendingMachine(User user){
		this("막심", user);
	}
	public VendingMachine(String title, User user){
		this.title = title;
		this.user = user;
		System.out.println("=========="+title+" 커피 머신"+"==========");
		createMenuList();
		showMenuList();
		checkInsertCoin();
	}

	
	//메뉴리스트 생성
	public void createMenuList() {
		menuList=new Menu[nameList.length];
		for (int i=0; i<nameList.length; i++) {
//			Menu menu=new Menu((i+1), nameList[i], priceList[i]); //구성요소들을 변수 선언해
			int no = i+1;
			String name=nameList[i];
			int price=priceList[i];
			
			Menu menu = new Menu(no,name,price);
			menuList[i]= menu;
		}
	}
	
	//전체 메뉴 출력
	public void showMenuList() {
		for (int i=0; i<nameList.length; i++) {
			System.out.print(menuList[i].getNo()+". \t");
			System.out.print(menuList[i].getName()+"\t");
			System.out.println(menuList[i].getPrice()+"원");
		}
	}
	//동전 투입후 총 투입금액에 맞춘 메뉴 출력
	public void showMenuList(int totalCoin) {
		for (int i=0; i<nameList.length; i++) {
			if (menuList[i].getPrice()<=totalCoin) {
				System.out.print(menuList[i].getNo()+". \t");
				System.out.print(menuList[i].getName()+"\t");
				System.out.println(menuList[i].getPrice()+"원");
			}
		}
	}
	public void showMenuList(String msg) {
		System.out.println("\t "+msg);
		for (int i=0; i<orderMenuCount; i++) {
			System.out.print(orderMenuList[i].getNo()+". \t");
			System.out.print(orderMenuList[i].getName()+"\t");
			System.out.println(orderMenuList[i].getPrice()+"원");
		}
	}
	
//	public void createOrderMenuList(int totalCoin) {
//		orderMenuList = new Menu[menuList.length];
//		for (int i=0; i<menuList.length; i++) {
//			if (menuList[i].getPrice()<=totalCoin) {
//				orderMenuList[i]=menuList[i];
//			}
//		}
//	}
//	public void createOrderMenuList(int totalCoin) { //객체(menu)로 선언해서 객체를 ordermenuList에 넣음 
//		orderMenuList = new Menu[menuList.length];
//		for (int i=0; i<menuList.length; i++) {
//			Menu menu = menuList[i];
//			if (menuList[i].getPrice()<=totalCoin) {
//				orderMenuList[i]=menu;
//			}
//		}
//	}
	public void createOrderMenuList(int totalCoin) { //orderMenuCount 변수를 이용해서 향상된 for문 사용
		orderMenuList = new Menu[menuList.length];
		for(Menu menu : menuList) {
			if (menu.getPrice()<=totalCoin) {
				orderMenuList[orderMenuCount]=menu;
				orderMenuCount++;
			}
		}
	}
	
	//입력되는 동전 체크
	public void checkInsertCoin() {
		System.out.println("=> 동전을 투입해 주세요.");
		int coin = user.insertCoin();
		if (coin == 100 || coin == 500) { //사용가능 동전 체크
			totalCoin +=coin;
			System.out.println("총 투입금액 : "+totalCoin);	
			//메뉴 선택 최소 금액 체크
			if (totalCoin>=200) {
				System.out.print("메뉴를 선택하시겠습니까?(y/n)> ");
				String menuSel = user.scan.next();
				if (menuSel.equals("y")) {
					createOrderMenuList(totalCoin);
//					showMenuList(totalCoin);
					showMenuList("주문 가능 메뉴 리스트");
					selectMenu();
				}
				else if(menuSel.equals("n")) {checkInsertCoin();} 
				else {
					System.out.println("잘못된 입력입니다.");
					checkInsertCoin();
					//메뉴 선택 체크를 메소드로 빼서 메소드 화
				}
				
			} else {
				//System.out.println("=> 동전을 투입해 주세요.");
				checkInsertCoin();
			}
		} else {
			System.out.println("=> 동전은 100원 또는 500원만 사용 가능합니다.");
			System.out.println("=> 동전 반환.");
			checkInsertCoin();
		}
	}
	
	public void selectMenu() { //종 투입금액에 맞는 메뉴를 보여준다.
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("취소는 ["+EXIT+"]번을 입력해 주세요.");
		int menuNo = user.selectMenu();
		if (menuNo != EXIT) {
			if (menuCheck(menuNo)) {
				placeOrder(menuNo);
			} else {
				selectMenu();
			}
		} else {
			System.out.println("동전을 반환하고 프로그램을 종료합니다.");
			System.out.println("반환 금액: "+totalCoin);
		}
		
		
		
		
//		Menu orderMenu = null;
//		
//		for (int i=0; i<orderMenuCount; i++) {
//			if (menuNo==orderMenuList[i].getNo()) {
////				//Menu menu=orderMenuList[i];
//				orderMenu = orderMenuList[i];
////				//if(menu.getNo() == menuNo) orderMenu=menu;
//			}
//		}
//		
//		if (orderMenu == null) {
//			selectMenu(); //잘못된 입력으로 재입력 보냄
//		} else {
//			System.out.println(orderMenu.getNo()+"번을 선택함");
//			System.out.println(orderMenu.getName()+"을 선택함");
//			System.out.println(orderMenu.getPrice()+"원");
//		}
		
		
	}
	
	//메뉴 체크하는 기능
	public boolean menuCheck(int menuNo) {
		boolean result = false;
		
		for (int i=0; i<orderMenuCount; i++) {
			if (menuNo==orderMenuList[i].getNo()) {
//				Menu menu=orderMenuList[i];
				result=true; //사용자가 선택한 번호가 현재 주문할 수 있는 메뉴 리스트에 있음
//				if(menu.getNo() == menuNo) orderMenu=menu;
			}
		}
		
		return result;
	}
	
	public void placeOrder(int menuNo) {
		//주문가능한 메뉴 리스트에서 선택한 meneNo를 비교하여 메뉴 주소를 orderMenu에 대입
		for (Menu menu : orderMenuList) {
			if(menu != null) {
				if(menu.getNo() == menuNo) {
					orderMenu=menu;
				}
			} else {
				break;
			}
		}
		System.out.println("==주문 완료==");
		processPayment();
	} //> 결제 진행으로 가야함
	
	public void processPayment() {
		if(orderMenu != null) {
			int price=orderMenu.getPrice(); 
			if(price<=totalCoin) {
				change = totalCoin-price;
			}
		}
		System.out.println("==결제 완료==");
		finalCheck();
	}
	
	public void finalCheck() {
		//잔돈이 최소 주문 금액보다 크면 계속 주문
		int price =menuList[menuList.length-1].getPrice();
		if (change>=price) {
			System.out.println("잔돈: "+change);
			totalCoin=change;
			System.out.print("계속 메뉴 선택(y/n)");
			if (user.scan.next().equals("y")) { // 여기 이상함! 두번쨰 주문하려고 하면 list 길이 null exception 뜸
				createOrderMenuList(totalCoin);
				showMenuList("주문 가능 메뉴 리스트");
				selectMenu();
			} else {
				System.out.println("==결제 내역==");
				System.out.print("메뉴명: "+orderMenu.getName()+", ");
				System.out.println("가격: "+orderMenu.getPrice());
				System.out.println("이용해 주셔서 감사합니다.");
				init();
			}
			
		} else {
			System.out.println("==결제 내역==");
			System.out.print("메뉴명: "+orderMenu.getName()+", ");
			System.out.println("가격: "+orderMenu.getPrice());
			System.out.println("이용해 주셔서 감사합니다.");
			init();
		}	
	}
	
	public void init(){
		orderMenuList = null;
		orderMenu = null;
		totalCoin = 0;
		orderMenuCount=0;
	}
	
	
	
	
	
	//동전 100원/500원 체크 checkInsertCoin() 내부로 이식 완료
	public boolean coinCheck(int coin) {
		boolean result=false;
		if (coin == 100 || coin == 500) {
			result = true;
		}
		return result;
	}
	
}
