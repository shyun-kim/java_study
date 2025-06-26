package chapter05;

import java.util.Scanner;

/*
 * 중첩 if문
 */

public class IfOverlabTest2 {

	public static void main(String[] args) {
		
		Scanner input =
				new Scanner(System.in);
		boolean math_pass=false, eng_pass = false;
		
		System.out.print("수학 점수를 입력해 주세요> ");
		math_pass = (input.nextInt() >= 60) ? true:false;
		
		System.out.print("영어 점수를 입력해 주세요> ");
		eng_pass = (input.nextInt() >= 60) ? true:false;
		
		
//		1. 중첩 if
		if (math_pass) {
			if (eng_pass) System.out.println("합격");
		}
		else System.out.println("불합격1");
		
//		2. 논리 연산자 &&
		if ((math_pass) && (eng_pass)) System.out.println("합격");
			else System.out.println("불합격2");

	}

}
