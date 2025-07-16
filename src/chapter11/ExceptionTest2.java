package chapter11;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("num1> ");
//		int num1 = scan.nextInt();
//		System.out.print("num2> ");
//		int num2 = scan.nextInt();
		
		
		try {int [] numbers = {1,2,3};
		System.out.println(numbers[0]);
		System.out.println(numbers[5]);
		} catch(Exception e) {
			System.out.println("예외발생");
			e.printStackTrace(); //스택에 찍힌 에러 메세지 출력
		} finally {
			scan.close();
			System.out.println("프로그램 종료");
		}
		
		
		
	}

}
