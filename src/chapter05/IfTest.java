package chapter05;

import java.util.Scanner;

/*
 * 단일 if 문: 조건의 결과가 True인 경우에만 실행함
 * if~else문: 조건의 결과가 true/false인 경우 각각 실행함
 * 형식: if(조건식) { 실행문;} else { 실행문; }
 * if~else if ~  ~ else: 여러개의 조건을 체크하여 실행함
 * 형식: if (조건식1) {
 * 			조건식 1이 true인 경우 실행문;
 * 		} else if (조건식2) {
 * 			조건식 2가 true인 경우 실행문;
 * 		}...
 * 		} else {
 * 			위의 모든 조건이 false인 경우 실행문;
 * 		}
 * ✔ 각 if 문의 실행문이 한 줄인 경우 {}(블록)을 생략할 수 있다.ㄱ
 */
public class IfTest {

	public static void main(String[] args) {
		Scanner scan =
				new Scanner(System.in);
		
		
		System.out.print("점수> ");
		int score = scan.nextInt();
		
		System.out.println("---시험 시작---");
		 
		//학점 출력: 95점 이상(A+), 90점 이상(A), 85점 이상(B+), 80점 이상(B)... 60점 이하(f) 
		if (score >= 95) {
			System.out.println("학점 : A+");
		} else if (score >= 90) {
			System.out.println("학점 : A");
		} else if (score >= 85) {
			System.out.println("학점 : B+");
		} else if (score >= 80) {
			System.out.println("학점 : B");
		} else if (score >= 75) {
			System.out.println("학점 : C+");
		} else if (score >= 70) {
			System.out.println("학점 : C");
		} else if (score >= 65) {
			System.out.println("학점 : D+");
		} else if (score >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
		
		 
		System.out.println("---시험 종료---");

	}

}
