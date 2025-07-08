package lunch;

import java.util.Scanner;

public class LunchOrderSystemOOP {
	//Field
	//주문할 메뉴: LunchMenu
	Scanner input;
	LunchOrderMenuManager menuManager;
	String[] lunchMenuNames = {"햄버거(🍔)","피이자(🍕)","라메응(🍜)","샐러드(🥗)"}; //배열의 값을 지정해 주는 것은 선언과 할당이 동시에 행해져야 함
	int[] lunchMenuPrice = {100,200,300,400};
	
	LunchMenu[] lunchMenuList;
	LunchOrderItem orderItemList[];
	LunchPaymentItem paymentItem;
	
	int orderCount = 0;
	int charge=0; //사용자가 입력한 결제금액
	int change=0; //잔돈
	String title;
	
	//시스템 메뉴: MainMenu
	
	
	//Constructor
	public LunchOrderSystemOOP() {
		//필드의 값들을 초기화
		//this.title=title;
		input = new Scanner(System.in);
		menuManager = new LunchOrderMenuManager(this); //클래스 전체 주소를 넘겨줄때는 this를 사용한다.
		lunchMenuList = new LunchMenu[4];
		orderItemList = new LunchOrderItem[4];
		
		menuManager.createLunchMenu();
		//showMainMenu();
	}
	public LunchOrderSystemOOP(String title) {
		//필드의 값들을 초기화
		this.title=title;
		input = new Scanner(System.in);
		menuManager = new LunchOrderMenuManager(this);
		lunchMenuList = new LunchMenu[4];
		orderItemList = new LunchOrderItem[4];
		
		menuManager.createLunchMenu();
		menuManager.showMainMenu();
	}
	
	
	
	//Method
	
		
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
		menuManager.showMainMenu();
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
		menuManager.showMainMenu();
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
		charge = 0;
		menuManager.showMainMenu();
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
			menuManager.showMainMenu();
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
		menuManager.showMainMenu();
	}
	
	
	
}
