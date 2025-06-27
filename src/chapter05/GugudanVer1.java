package chapter05;

import java.util.Scanner;

public class GugudanVer1 {

	public static void main(String[] args) {
		// 출력하는 구구단을 콘솔로 입력받아 실행 
		// 구구단 2단 출력
		int i=0;
		int dan = 0;
		
		Scanner input =
				new Scanner (System.in);
		
		System.out.println("출력하실 구구단을 입력해 주세요");
				
		while(true) {
			System.out.print("단을 입력하십시오(종료시 0 입력)> ");
			dan = input.nextInt();
			
			if (dan != 0) {
				System.out.println("\n"+dan+"단");
				System.out.println("---------------");
				
				for (i=1; i<=9; i++) {
					System.out.println(dan+" x "+i+" = "+(dan*i));
				} //for
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
				
		}//while

	}//main

}//class
