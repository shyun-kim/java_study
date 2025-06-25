package chapter03;

import java.util.Scanner;

public class ScannerTest {
	public static void main (String[] args) {
		Scanner scan = 
				new Scanner(System.in);
	
		//입력부
		System.out.print("이름을 입력해 주세요 : ");
		String name =scan.next();
		
		System.out.print("나이를 숫자만 입력해 주세요 : ");
		int age =scan.nextInt();
		
		System.out.print("학습하는 과목을 입력해 주세요 : ");
		String subj =scan.next();
		
		//출력부
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("나이 : "+subj);
	}

}
