package chapter05;

import java.util.Scanner;

public class BeverageOrderTest {

	public static void main(String[] args) {
		
		Scanner input =
				new Scanner(System.in);
		boolean repeat = true;
		
		while (repeat) {
			//0. 선언부
			int menu_num=0;
			int menu_price=0;
			String menu_name = "";
			boolean menu_flag = true;
			String menuPriceOutput="";
			
			int paidPrice =0;
			int change =0;
			boolean char_flag = true; 
			
			//1. 메뉴
			System.out.println("[시작]");
			System.out.println("===메뉴판===");
			System.out.println("1. ☕ 아메리카노 - 2,800원");
			System.out.println("2. 🍵 바닐라 라떼 - 3,500원");
			System.out.println("3. 🥤 딸기 쉐이크 - 4,000원");
			
	
			//2. 메뉴 주문
			while (menu_flag) {
				menu_flag = false;
				System.out.print("주문할 번호 입력> ");
				
				if (input.hasNextInt()) {
					menu_num=input.nextInt();
					
					switch (menu_num) {
						case 1:
							menu_name = "☕ 아메리카노";
							menu_price = 2800;
							break;
						case 2:
							menu_name = "🍵 바닐라 라떼";
							menu_price = 3500;
							break;
						case 3:
							menu_name = "🥤 딸기 쉐이크";
							menu_price = 4000;
							break;
						default :
							System.out.println("준비중 입니다.");
							menu_flag=true;
					}
					
					//출력용 메뉴가격 
					menuPriceOutput = String.format("%,d", new Object[] {Integer.valueOf(menu_price)});
					
				} else {
					System.out.println("올바르지 않은 입력값 입니다.");
					menu_flag=true;
					input.next();
				}
			}
				
			System.out.println("=> 주문 메뉴 : "+menu_name+", 결제 예정 금액: "+/*String.format("%,d", menu_price)*/menuPriceOutput+"원");
			
			
			// 03. 결제 파트
				
			while (char_flag) {
				System.out.print("결제할 금액 입력> ");
				paidPrice += input.nextInt();
				System.out.println("총 입금 금액 : "+String.format("%,d", paidPrice)+"원");
				
				if (menu_price <= paidPrice) {
					change = paidPrice-menu_price;
					System.out.println("결제 완료! 잔돈: "+String.format("%,d",change)+"원 입니다.");
					char_flag = false;
				} else {
					System.out.println("금액이 부족합니다. 다시 입력해 주세요.");
				}
			}
				
			// 04. 주문완료
			System.out.println("[종료]");
			System.out.println("이용해 주셔서 감사합니다.\n");
			
			
			while (repeat) {
				System.out.println("1. 처음 메뉴로 돌아가기");
				System.out.println("2. 종료하기");
				
				
				if (input.hasNextInt()) {
					int gotohead = input.nextInt();
					
					if (gotohead == 2) {
						repeat = false;
						System.exit(0);
						System.gc();
					} else if (gotohead ==1 ) {
						break;
					}
					else {
						System.out.println("잘못된 접근입니다.");
					}
						
				} else {
					System.out.println("잘못된 접근입니다.");
					input.next();
				}
			}
				
			
		}
			
	}

}
