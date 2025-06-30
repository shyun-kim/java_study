package chapter06;

import java.util.Scanner;

/*
 * 학생 한명의 국어, 영어, 수학 점수를 입력받아 출력하는 로직 
 */

public class ScoreTestVer1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = null;
		int scoreList[] = new int[3];
		String subject[] = {"국어", "영어", "수학"};
		double ttav[]=new double[2];
		
		
		
		
//		1. 데이터 입력
		System.out.print("이름을 입력하세요> ");
		name = input.next();
		
//		System.out.println("점수> ");
//		scoreList[0]=input.nextInt();
//
//		System.out.println("점수> ");
//		scoreList[1]=input.nextInt();
//		
//		System.out.println("점수> ");
//		scoreList[2]=input.nextInt();
		
		
		double total = 0.0;
		double avg = 0.0;
		int j=0;
		

		for (int i=0; i<scoreList.length+2; i++) {
			if (i<scoreList.length) {
				System.out.print(subject[i]+"점수> ");
				scoreList[i]=(int)input.nextInt();
				total += (double)scoreList[i];
			} else {
				ttav[j]=total;
				j++;
				ttav[j]=avg=(total/scoreList.length);
				i=scoreList.length+2;
			}
			
		}
				
				
//				for (int i=0; i<scoreList.length+2; i++) {
//				if (i<scoreList.length) {
//					System.out.print(subject[i]+"점수> ");
//					scoreList[i]=(int)input.nextInt();
//					total += (double)scoreList[i];
//				} else if (i == scoreList.length){
//					ttav[j]=total;
//					j++;
//				} else {
//					ttav[j]=avg=(total/scoreList.length);
//			}
//		}
		
//				i=scoreList.length;
//				break;

		
//		2. 데이터 출력: 학생명 국어 영어 수학
		
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균\t");
		System.out.print(name+"\t");
		for (int num: scoreList) {
			System.out.print(num+"\t");
		}
		for (double num2: ttav) {
			System.out.print(String.format("%.2f", num2)+"\t");
		}
		
		
		
		
		
	}

}
