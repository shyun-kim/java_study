package chapter05;

import java.util.Scanner;

/*
 * 반복문 : for (초기값선언; 조건식; 증감연산식) {실행문(조건식이 true인 경우 실행);}
 * 		조건식이 false가 되면 for 블록 종료
 * 		초기값으로 선언된 변수는 for 블록 안에서만 사용
 */
public class ForTest {

	public static void main(String[] args) {
		//1에서 10까지 정수를 출력
//		for (int i=1; i<=10; i++) {
//			System.out.println("i= "+i);
//		}
			
		//시작과 종료값은 실행시 외부에서 입력을 통해 진행됨
		
		
		int start = 0;
		int end= 0;
		int sum = 0;
		
		Scanner input =
				new Scanner (System.in);
		
		System.out.print("시작할 숫자를 입력하세요> ");
		start = input.nextInt();
		
		System.out.print("종료할 숫자를 입력하세요> ");
		end = input.nextInt();
		
		for (int i = start; i<=end; i++) {
			sum += i;
			
		}
		System.out.println(sum);
		
		

	}

}
