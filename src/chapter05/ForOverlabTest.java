package chapter05;

import java.util.Scanner;

public class ForOverlabTest {

	public static void main(String[] args) {
		// 2단부터 5단까지 한번에 출력
		
		Scanner input = 
				new Scanner(System.in);
		
		int start = 0, end = 0;
		boolean flag = true;
		
		System.out.println("프로그램 종료: start, end 모두 0 입력");
		
		while(flag) {
			
			System.out.print("Start > ");
			start = input.nextInt();
			System.out.print("End > ");
			end = input.nextInt();
			
			//실행여부 확인
			if (start == 0 && end == 0) {
				flag = false;
				
			} else {
				for (int i=1; i<=9; i++) {
					for (int j=start; j <=end; j++) {
						System.out.print(j+" x "+i+" = "+(j*i)+"\t");
					}
					System.out.println();
				}
				System.out.println("프로그램 종료: start, end 모두 0 입력");
			}	
		} //while
		
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
		
		
		
//		for (int i=1; i<=9; i++) {
//			for (int j=6; j <=9; j++) {
//				System.out.print(j+" x "+i+" = "+(j*i)+"\t");
//			}
//			System.out.println(123);
//		}
		 

		

	}

}
