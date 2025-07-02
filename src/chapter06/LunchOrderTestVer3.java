package chapter06;

import java.util.Scanner;

/*
 * 음식 주문/결제 프로그램(콘솔에서 실행)
 * -음식을 주문(1), 결제(2), 프로그램 종료(9)하는 메뉴로 구성됨
 * 프로그램 종료를 제외 하고 나머지 메뉴는 반복 선택 가능하다
 * 
 * 예외사항 처리: 메뉴선택, 결제금액 입력 시 정수형 타입이 아닌 경우 메세지 출력 후 재입력 유도
 * 입력값이 부족한 경우 재입력을 유도
 * 결제금액이 부족한 경우 재입력을 통해 금액을 누적으로 계산하여 저장 후 결제
 */

public class LunchOrderTestVer3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean menuFlag = true;
		
//		햄버거(🍔):100
//		피자(🍕):200
//		라멘(🍜):300
//		샐러드(🥗):400
		
		while (menuFlag) {
			System.out.println("*******************************************");
			System.out.println("\t Welcome to Food Mart!");
			System.out.println("*******************************************");
			System.out.println("\t 1.음식 주문");
			System.out.println("\t 2.음식 결제");
			System.out.println("\t 9.프로그램 종료");
			System.out.println("*******************************************");
			
			System.out.println("메뉴를 선택하십시오> ");
			int selectednum=input.nextInt();
			
			if (selectednum == 1) {
				
				//System.out.println("주문하신 메뉴는 "+menuName+"이고, 가격은 "+menuPrice+"원 입니다.");
				
			} else if (selectednum == 2) {
				
			} else if (selectednum == 9) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못된 접근입니다.");
			}
				
		}
		
		
		
		
		
	}

}