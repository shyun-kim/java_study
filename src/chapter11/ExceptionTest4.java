package chapter11;

import java.util.Scanner;

/**
 * Exception 객체 생성. 다른 메소드에게 throw로 예외처리 넘기기
 */
public class ExceptionTest4 {
	
	public static void checkAge (int age) throws Exception {
		try {if(age<0) {
				throw new Exception("나이는 0보다 커야한다.");
			} else {
				System.out.println("age: "+age);
			}
		} catch (Exception e) {
			System.out.println("age값은 0보다 커야함");
			e.printStackTrace();
		}
	}

	
	public static void main(String [] args) {
		//키보드를 통해 나이를 입력받아 체크함
//		Scanner scan = new Scanner(System.in);
//		System.out.print("num1> ");
//		int num1 = scan.nextInt();
//		System.out.print("num2> ");
//		int num2 = scan.nextInt();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이> ");
		int age = scan.nextInt();
		
		
		
		
		try {checkAge(age);
		} catch (Exception e) {
		System.out.println("Exception Age는 0보다 커야함");
		} finally {
			scan.close();
			System.out.println("프로그램 종료");
			}
	
	//method
//	public static void checkAge (int age) {
//		try {
//			if(age<0) {
//				throw new Exception("나이는 0보다 커야한다.");
//			} else {
//				System.out.println("age: "+age);
//			}
//		} catch (Exception e) {
//			System.out.println("age값은 0보다 커야함");
//			e.printStackTrace();
//		}
		
		//method
		
		
		
	
	}//main

}//class
