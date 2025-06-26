package chapter05;

import java.util.Scanner;

public class LunchOrderTestVer1_review {

	public static void main(String[] args) {
		//0. 메뉴판
		System.out.println("*******************************************");
		System.out.println("\t Welcome to Food Mart!");
		System.out.println("*******************************************");
		System.out.println("\t 1.햄버거(🍔):100\t 2.피자(🍕):200");
		System.out.println("\t 3.라멘(🍜):300\t 4.샐러드(🥗):400");
		System.out.println("\t 0.나가기");
		System.out.println("*******************************************");
		
		//선언부
		Scanner input =
				new Scanner (System.in);
		int menu_num = -1;
		String menu_name ="";
		int menu_price = 0;
		int charge = 0;
		int change = 0;
		
		
		//1. 주문 메뉴 선택
		System.out.print("메뉴 번호를 입력해 주십시오.> ");
		
		if (input.hasNextInt()) {
			menu_num = input.nextInt();
			
			if (menu_num == 1) {
				menu_name = "햄버거(🍔)";
				menu_price = 100;
			} else if (menu_num == 2) {
				menu_name = "피자(🍕)";
				menu_price = 200;
			} else if (menu_num == 3) {
				menu_name = "라멘(🍜)";
				menu_price = 300;
			} else if (menu_num == 4) {
				menu_name = "샐러드(🥗)";
				menu_price = 400;
			} else if (menu_num == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				System.gc();
			} else {
				System.out.println("잘못된 입력 입니다.");

			}
		} else {
			System.out.println("잘못된 입력 입니다.");
		}
		
		
		//2. 주문 메뉴 결제
		System.out.println(menu_name+"을(를) 주문하셨습니다. 결제하실 금액은 "+menu_price+"원 입니다.");
		System.out.print("결제하실 금액을 입력해 주십시오. >");
				
		if (input.hasNextInt()) {
			charge = input.nextInt();
			
			if (charge >= menu_price) {
				change=(charge-menu_price);
			} else {
				System.out.println("금액이 부족합니다.");
				change=(charge-menu_price);
			}
			
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		//3. 주문 내역 출력 : 주문한 메뉴는 ()이고, 결제금액 (), 잔돈() 입니다.
		System.out.println("주문한 메뉴는 "+menu_name+"이고, 결제하실 금액은 "+menu_price+"원 입니다.\n지불하신 금액은 "+charge+"원 이며, 거스름돈은 "+change+"원 입니다.");

		
		
		

	}

}
