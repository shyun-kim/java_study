package chapter05;

import java.util.Scanner;

/*
 * 반복문 while(조건식) {실행문 (조건식이 true 인 경우에만 실행);}
 * 종료되는 시점을 정확하게 알고 있는 경우 사용됨
 */

public class WhileTest {

	public static void main(String[] args) {
		// 1~10까지 정수의 합계를 출력
		// 시작과 종료값은 실행시 외부에서 입력
		Scanner input =
				new Scanner(System.in);
		
		int start = 0;
		int end = 0;
		int sum = 0;
		
		System.out.print("시작값을 입력해 주십시오> ");
		start = input.nextInt();
		System.out.print("종료값을 입력해 주십시오> ");
		end = input.nextInt();
		
		while(start<=end) {
			sum += start;
			System.out.println(start);
			start++;
		}
		System.out.println(sum);
	}

}
