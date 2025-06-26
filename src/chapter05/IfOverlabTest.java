package chapter05;

import java.util.Scanner;

public class IfOverlabTest {

	public static void main(String[] args) {
		
		Scanner input =
				new Scanner(System.in);
		
		System.out.print("수학 점수를 입력해 주세요> ");
		int math = input.nextInt();
		
		System.out.print("영어 점수를 입력해 주세요> ");
		int eng = input.nextInt();
		
		
//		1. 중첩 if
		if (math >= 60) {
			if (eng >= 60) {
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격");
		}
		
//		2. 논리 연산자 &&
		if ((math >= 60) && (eng >= 60)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

}
