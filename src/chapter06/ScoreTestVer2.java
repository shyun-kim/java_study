package chapter06;

import java.util.Scanner;

/*
 * 더조은 고등학교 1학년 1반 성적관리
 * 학생은 홍길동, 이순신, 김유신, 강감찬, 홍길순
 * 과목은 국어, 영어, 수학 3과목
 * 입력받은 과목 총점과 평균 구함
 * 학생명, 과목별 점수, 총점,평균은 각각 1차원 배열
 * 입출력을 위해 각 배열 주소 통일
 * 
 * 프로그래밍 방식: 구조적(Structured) 방식, 객체지향적(Object Oriented) 방식
 */

public class ScoreTestVer2 {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------");
		System.out.println("\t더조은 고등학교 1-1 성적관리");
		System.out.println("----------------------------------------------");
		
		
		//Step 1. 배열, 변수 선언
		Scanner scan = new Scanner(System.in);
		
		final int MAX_SIZE;
		System.out.print("크기 입력> ");
		MAX_SIZE = scan.nextInt();
		
		
		String nameList[] = new String[MAX_SIZE];
		int korList[] = new int[MAX_SIZE];
		int engList[] = new int[MAX_SIZE];
		int mathList[] = new int[MAX_SIZE];
		int totList[] = new int[MAX_SIZE];
		int avgList[] = new int[MAX_SIZE];
		
		
		//Step 2. 데이터 입력
		for (int i=0; i<nameList.length; i++) {
			System.out.print("학생명> ");
			nameList[i] = scan.next();
			
			System.out.print("국어점수> ");
			korList[i] = scan.nextInt();

			System.out.print("영어점수> ");
			engList[i] = scan.nextInt();
			
			System.out.print("수학점수> ");
			mathList[i] = scan.nextInt();
			
			totList[i] = korList[i]+engList[i]+mathList[i];
			avgList[i] = totList[i]/3;
			
			System.out.println("계속 입력 하시겠습니까(계속: 아무키나 누르세요, 종료:n)?> ");
			if(scan.next().equals("n")) {
				//종료
				break;
			}
		}
		System.out.println();
		
		//Step 3. 데이터 출력
		for (int i=0; i<nameList.length; i++) {
			if (nameList[i] != null) {
				System.out.print(nameList[i]+"\t");
				System.out.print(korList[i]+"\t");
				System.out.print(engList[i]+"\t");
				System.out.print(mathList[i]+"\t");
				System.out.print(totList[i]+"\t");
				System.out.print(avgList[i]+"\n");
			}
		}
		
		System.out.println("----------------------------------------------");
		
			
			
		boolean searchFlag = true;
		while (searchFlag == true) {
			//Step 4. 데이터 조회
			//조회할 학생명 입력 받기
			System.out.print("학생명 검색> ");
			String searchName = scan.next();
			//nameList에서 입력한 학생명 검색 -> 학생의 nameList 주소를 변수에 저장한다.
			int count = 0;
			int searchIdx = -1;
			
			for (String name : nameList) {
				if (name != null) {
					if (name.equals(searchName)) {
						searchIdx = count;
					}else {
						count++;
					}
				}
			}
			System.out.print("검색 결과 주소: "+searchIdx+"\n");
			
			//Step 5. 데이터 조회 결과 출력
			System.out.println("----------------------------------------------");
			System.out.println("\t검색결과");
			System.out.println("----------------------------------------------");
			System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
			System.out.println("----------------------------------------------");
			System.out.print(nameList[searchIdx]+"\t");
			System.out.print(korList[searchIdx]+"\t");
			System.out.print(engList[searchIdx]+"\t");
			System.out.print(mathList[searchIdx]+"\t");
			System.out.print(totList[searchIdx]+"\t");
			System.out.print(avgList[searchIdx]+"\n\n");
			
			System.out.print("계속 검색 하시겠습니까(계속: 아무키나 누르세요, 종료:n)?> ");
			if(scan.next().equals("n")) {
				searchFlag = false; //break; 종료
			}
		}; //while - searchFlag: Step4, Step5 반복
		
		System.out.println("-- 프로그램 종료 --");
		
	}//main

}//class
