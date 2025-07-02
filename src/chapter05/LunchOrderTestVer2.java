package chapter05;

import java.util.Scanner;

/*
 * 예외사항 처리: 메뉴선택, 결제금액 입력 시 정수형 타입이 아닌 경우 메세지 출력 후 재입력 유도
 * 입력값이 부족한 경우 재입력을 유도
 * 결제금액이 부족한 경우 재입력을 통해 금액을 누적으로 계산하여 저장 후 결제
 */

public class LunchOrderTestVer2 {

	public static void main(String[] args) {
		Scanner input =
				new Scanner(System.in);
		
		
		while (true) {
		
			
			int menuNum = -1;
			String menuName ="";
			int menuPrice = 0;
			boolean menu_flag = true;
			
			
				//0. 메뉴판
				System.out.println("*******************************************");
				System.out.println("\t Welcome to Food Mart!");
				System.out.println("*******************************************");
				System.out.println("\t 1.햄버거(🍔):100\t 2.피자(🍕):200");
				System.out.println("\t 3.라멘(🍜):300\t 4.샐러드(🥗):400");
				System.out.println("\t 9.나가기");
				System.out.println("*******************************************");
				
				//1. 주문 메뉴 선택
				
				
				while(menu_flag) {
					System.out.print("메뉴 선택(숫자)> ");
					if (input.hasNextInt()) {
						menuNum = input.nextInt();
						
						switch (menuNum) {
							case 1: 
								menuName="햄버거(🍔)";
								menuPrice=100;
								menu_flag = false;
								break;
							case 2:
								menuName="피자(🍕)";
								menuPrice=200;
								menu_flag = false;
								break;
							case 3:
								menuName="라멘(🍜)";
								menuPrice=300;
								menu_flag = false;
								break;
							case 4:
								menuName="샐러드(🥗)";
								menuPrice=400;
								menu_flag = false;
								break;
							case 9:
								System.out.println("프로그램을 종료합니다.");
								System.exit(0);
							System.gc();
						default:
							System.out.println("준비중 입니다.");
					} //switch		
					
				} else {
					System.out.println("올바르지 않은 입력값 입니다. 다시 입력해 주세요");
					input.next();
				}
				
			}
			
			System.out.println("주문하신 메뉴는 "+menuName+"이고, 가격은 "+menuPrice+"원 입니다.");
			
			//2. 주문 메뉴 결제
			int charge = 0;
			int change = 0;
			boolean char_flag = true;
			
			while (char_flag) {
				System.out.print("결제할 금액을 입력(숫자)>");
				if (input.hasNextInt()) {
					charge += input.nextInt();
					System.out.println("총 입력 금액: "+charge);
					
					if (charge >= menuPrice) {
						change=charge-menuPrice;
						char_flag=false;
					} else {
						System.out.println("요금이 부족합니다. 다시 입력해 주세요.");
					}
					
				} else {
					System.out.println("올바르지 않은 입력값 입니다.");
					input.next();
				} //주문 메뉴금액 if문
			}
				
			
			
			//3. 주문 내역 출력 : 주문한 메뉴는 ()이고, 결제금액 (), 잔돈() 입니다.
			System.out.println("주문한 메뉴는 "+menuName+"이고, 결제금액은 "+menuPrice+"원, 지불하신 금액은 "+charge+"원, 잔돈 "+change+"원 입니다.\n");
		}
			

		
		

	}

}
