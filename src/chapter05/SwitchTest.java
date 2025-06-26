package chapter05;

import java.util.Scanner;

/*
 * 변수 값을 체크하여 조건식 실행문으로 보냄
 * switch(변수) {
 * 	case 변수와 비교할 값1:
 * 		변수와 값1이 동일하면 실행하는 실행문1;
 * 		break;
 * 
 * 	case 변수와 비교할 값2:
 * 		변수와 값2가 동일하면 실행하는 실행문2;
 * 		break;
 * ...
 * 	default:
 * 		변수와 비교값이 모두 일치하지 않을때 실행하는 실행문;
 * }
 */
public class SwitchTest {

	public static void main(String[] args) {
		//프로그램 실행 시 정수값을 입력받아 결과를 출력
		//입력 값이 1이면 사과🍎출력
		//입력 값이 2이면 오렌지🍊출력
		//입력 값이 3이면 복숭아🍑출력
		//입력 값이 4이면 키위🥝출력
		//그외의 숫자는 '준비중입니다.' 출력
		
		Scanner input =
				new Scanner(System.in);
		int num = -1;
		
		System.out.print("숫자를 입력해주세요. >");
		num = input.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("사과🍎");
			break;
		case 2:
			System.out.println("오렌지🍊");
			break;
		case 3:
			System.out.println("복숭아🍑");
			break;
		case 4:
			System.out.println("키위🥝");
			break;
		default:
			System.out.println("준비중 입니다.");
		}
		System.out.println("-- 종료 --");
		
	}

}
