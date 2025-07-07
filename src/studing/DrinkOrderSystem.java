package studing;

import java.util.Scanner;

public class DrinkOrderSystem {
	Scanner scan = new Scanner(System.in);
	DrinkMenu dmenu = new DrinkMenu();
	DrinkOrder dorder = new DrinkOrder();
	DrinkOrder dorderList[] = new DrinkOrder[3];
	
	
	
	public void mainMenu() {
		System.out.println("=== 메뉴판 ===");
		System.out.println("1.☕ 아메리카노 - 2,800원");
		System.out.println("2.🍵 바닐라 라떼 - 3,500원");
		System.out.println("3.🥤 딸기 쉐이크 - 4,000원");
		orderMenu();
	}
	
	public void orderMenu() {
		System.out.print("주문할 메뉴 번호 입력> ");
		if(scan.hasNextInt()) {
			int menuSel=scan.nextInt();
			order(menuSel);
		}else {
			System.out.println("잘못된 입력입니다.");
			scan.next();
			orderMenu();
		}
	}
	
	public void order(int menuSel) {
		if(menuSel == 1) {
			
			repeat();
		}else {
			System.out.println("메뉴 준비중입니다.");
			orderMenu();
		}
	}
	
	
	
	
	public void repeat() {
		String reOrder;
		System.out.print("계속 주문하시겠습니까?(y/n)> ");
		reOrder=scan.next();
		if(reOrder.equals("y")) {
			orderMenu();
		} else if (reOrder.equals("n")) {
			mainMenu();
		} else {
			System.out.println("잘못된 입력입니다.");
			repeat();
		}
	}

}
