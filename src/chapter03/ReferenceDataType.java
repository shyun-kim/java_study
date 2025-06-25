package chapter03;

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class ReferenceDataType {
	public static void main(String[] args) {
		//참조 데이터 타입 정의 : 배열, 클래스, 인터페이스 ...
		String name = 
				new String("홍길동"); //new 이후는 생성자
		Scanner scan =
				new Scanner(System.in);
		
		//!중요: String class는 기본형으로도 사용이 가능함
		String name2 = "홍길동";
		
		System.out.println(name);
		System.out.println(scan);
		System.out.println(name2);
		System.out.println(name == name2);
	}

}
