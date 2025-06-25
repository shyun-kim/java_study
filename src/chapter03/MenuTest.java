package chapter03;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		
		
		//출력부
		System.out.println("*****************************************");
		System.out.println("\tWelcome to Shopping Mall");
		System.out.println("\tWelcome to Food Market");
		System.out.println("*****************************************");
		System.out.println("\t1.상품보기 \t2.상품구입");
		System.out.println("\t3.영수증보기 \t4.종료");
		System.out.println("*****************************************");
		
		//입력부
		Scanner input=
				new Scanner(System.in);
		System.out.print("메뉴를 선택해 주세요(숫자)> ");
		int mnum = input.nextInt();

		//선택메뉴(유효성검사) 체크 파트
		
		System.out.println("선택한 메뉴 : "+mnum);

	}

}
