package chapter04;

import java.util.Scanner;

/*
 * 삼항연산: (조건식-비교연산자 사용) ? true일때 결과1: false일때 결과2;
 * if 조건문과 동일한 역할
 * 결과 값을 변수에 넣고 싶으면, 결과와 동일한 타입으로 변수를 선언해 줘야함
 */

public class OpTernaryTest {

	public static void main(String[] args) {
		 //int score =80;
		 
		 //score가 60점 이상이면 "합격". 이하면 "불합격", 해당 결과를 result 변수에 대입함
		 
		 Scanner input =
				 new Scanner(System.in); // ctrl+shift+o : import를 하지 않은 명령어 자동 import
		 System.out.print("점수를 숫자만 입력하시오.> ");
		 int score = input.nextInt();
		 
		 //출력부
		 String result = (score >= 60)? "합격":"불합격";
		 System.out.println(result);

	}

}
