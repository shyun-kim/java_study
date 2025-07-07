package chapter07;

import java.util.Scanner;

public class LunchOrderSystemOOP {
	//Field
	//주문할 메뉴: LunchMenu
	Scanner input = new Scanner(System.in);
	String[] lunchMenuNames = {"햄버거(🍔)","피이자(🍕)","라메응(🍜)","샐러드(🥗)"};
	int[] lunchMenuPrice = {100,200,300,400};
	
	LunchMenu[] lunchMenuList = new LunchMenu[4];
	LunchOrderItem orderItemList[] = new LunchOrderItem[4];
	LunchPaymentItem paymentItem;
	
	int orderCount = 0;
	int charge=0; //사용자가 입력한 결제금액
	int change=0; //잔돈
	
	//시스템 메뉴: MainMenu
	
	
	//Constructor
	
	
	//Method
	//런치메뉴 생성
	public void createLunchMenu() {
		
		for (int i=0;i<lunchMenuList.length;i++) {
			LunchMenu menu = new LunchMenu();
			menu.no=i+1;
			menu.name=lunchMenuNames[i];
			menu.price = lunchMenuPrice[i];
			lunchMenuList[i] = menu;
		}
	}
	
	//런치메뉴 체크
	public void showLunchMenu() {
		for (LunchMenu menu : lunchMenuList) {
			System.out.print(menu.no+". ");
			System.out.print(menu.name+" \t");
			System.out.println(menu.price);
		}
		selectLunchMenu();
		
//		for (int i=0;i<lunchMenuList.length;i++) {	
//			lunchMenuList[i].no=lunchMenuNames[i];
//			lunchMenuList[i].name=lunchMenuNames[i];
//			lunchMenuList[i].price=lunchMenuPrice[i];
//		}
//		System.out.println("lunchMenuList>> ");
//		for (int i=0;i<lunchMenuList.length;i++) {
//			System.out.print(lunchMenuList[i].name+" \t");
//			System.out.println(lunchMenuList[i].price+" !!");
//		}
	}
	
	
	//런치메뉴 선택
	public void selectLunchMenu() {
		System.out.print("주문메뉴> ");
		if (input.hasNextInt()) {
			lunchMenuCheck(input.nextInt());
		} else {
			System.out.println("잘못된 입력입니다.");
			input.next();
			selectLunchMenu();
		}
	}
		
	//메인메뉴 출력
	public void showMainMenu() {
		System.out.println("*******************************************");
		System.out.println("\t Welcome to Food Mart!");
		System.out.println("*******************************************");
		System.out.println("\t 1.음식 주문");
		System.out.println("\t 2.주문 내역");
		System.out.println("\t 3.음식 결제");
		System.out.println("\t 4.결제 내역");
		System.out.println("\t 9.프로그램 종료");
		System.out.println("*******************************************");
		
		createLunchMenu();
		selectMainMenu();
	}
	
	//메인메뉴 선택
	public void selectMainMenu() {
		System.out.print("메뉴를 선택하십시오> ");
		
		if (input.hasNextInt()) {
			mainMenuCheck(input.nextInt());
		} else {
			System.out.println("잘못된 입력입니다.");
			input.next();
			selectMainMenu();
		}
	}
	
	//메인메뉴 체크
	public void mainMenuCheck(int mainMenu) {
		switch (mainMenu) {
			case 1:
				showLunchMenu();
				break;
			case 2:
				orderList();
				break;
			case 3:
				payment();
				break;
			case 4:
				paymentList();
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
			order(lunchMenu);
		} else {
			System.out.println("메뉴 준비중입니다.");
			showLunchMenu();
		}
	}
	
	public int searchOrderItemIdx(int lunchMenu) {
		int idx = -1;
		for(int i=0;i<orderCount; i++) {
			LunchOrderItem orderItem = orderItemList[i];
			if (orderItem.no == lunchMenu) {
				idx=i;
			}
		}
		return idx;
	}
	
	public void orderItemListInit() {
//		orderItemList = new LunchOrderItem[4];
//		for (int i =0; i<orderCount; i++) {
//			orderItemList[i]=null;
//		}
		
		for(LunchOrderItem orderItem : orderItemList) {
			if(orderItem != null) orderItem = null;
		}
		orderCount = 0;
	}
	
	
	//주문: order()
	public void order(int lunchMenu) {
		//orderItem = new LunchOrderItem[5];
		
		System.out.println(lunchMenu+" 주문");
		// lunchMenuList의 메뉴 번호 확인
		
		for (LunchMenu menu : lunchMenuList) { //menu.no == lunchMenu
			if(menu.no == lunchMenu) {
				int idx = searchOrderItemIdx(lunchMenu);
				if(idx == -1) {
					orderItemList[orderCount] = new LunchOrderItem();
					
					orderItemList[orderCount].no = menu.no;
					orderItemList[orderCount].name = menu.name;
					orderItemList[orderCount].price = menu.price;
					orderItemList[orderCount].qty = 1;		
					orderCount++;
				} else {
					orderItemList[idx].qty++;	//여기 원문 체크
				}
				break;
			}
		}
		System.out.println("==주문완료==");
		showMainMenu();
	}
	
	//주문 리스트: orderList()
	public void orderList() {
		if (orderCount == 0) {
			System.out.println("=> 주문내역이 없습니다. 음식을 주문해주세요.");
		} else {
			System.out.println("============================");
			System.out.println("\t 주문 리스트");
			System.out.println("============================");
			System.out.println("번호\t메뉴명\t가격\t수량");
			System.out.println("============================");
			for (LunchOrderItem orderItem:orderItemList) {
				if (orderItem != null) {
					System.out.print(orderItem.no+"\t");
					System.out.print(orderItem.name+"\t");
					System.out.print(orderItem.price+"\t");
					System.out.println(orderItem.qty+"\t");
				}
			}
		}
		showMainMenu();
	}
	
	//결제: payment()
	public void payment() {
		if (orderCount == 0) {
			System.out.println("=> 주문내역이 없습니다. 음식을 주문해주세요.");
		} else {
			int total = totalPayment();
			System.out.println("결제 예정 금액> "+total);
			System.out.print("결제할 요금 입력(숫자)> ");
			if (input.hasNextInt()) {
				charge += input.nextInt();
				System.out.println("총 입력 금액: "+charge);
				if (charge >= total) {
					change=charge-total;
					
					paymentItem = new LunchPaymentItem();
					paymentItem.name=orderItemList[0].name+"등";
					paymentItem.totalPayment=total;
					paymentItem.amount=charge;
					paymentItem.change=change;
					System.out.println("결제 완료");
					orderItemListInit();
					
				} else {
					System.out.println("요금이 부족합니다. 다시 입력해 주세요.");
					payment();
				}
				
			} else {
				System.out.println("올바르지 않은 입력값 입니다.");
				input.next();
			}
		}
		showMainMenu();
	}
	
	public int totalPayment() {
		int sum= 0;
		for (LunchOrderItem orderItem : orderItemList) {
			if(orderItem !=null) {
				sum += orderItem.price*orderItem.qty;
			}
		}
		return sum;
	}
	
	//결제 내역: paymentList()
	public void paymentList() {
		if (paymentItem == null) {
			System.out.println("결제 내역 없음. 주문을 진행해 주세요.");
			showMainMenu();
		} else {
			System.out.println("============================");
			System.out.println("\t 결제 리스트");
			System.out.println("============================");
			System.out.println("주문명\t결제금액\t입금액\t잔돈");
			System.out.println("============================");
			
			System.out.print(paymentItem.name+"\t");
			System.out.print(paymentItem.totalPayment+"\t");
			System.out.print(paymentItem.amount+"\t");
			System.out.println(paymentItem.change+"\t");
				
		}
		showMainMenu();
	}
	
	
	
}
