package chapter06;

import java.util.Scanner;

/*
 * ScoreTestVer2의 결과에 메뉴를 추가함
 */

public class ScoreTestVer3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		boolean menuFlag = true;
		
		int countStu = 0; // 등록된 학생수 저장
		final int MAX_SIZE;
		
		System.out.print("크기 입력> ");
		MAX_SIZE = scan.nextInt();
		
		String nameList[] = new String[MAX_SIZE];
		int korList[] = new int[MAX_SIZE];
		int engList[] = new int[MAX_SIZE];
		int mathList[] = new int[MAX_SIZE];
		int totList[] = new int[MAX_SIZE];
		int avgList[] = new int[MAX_SIZE];
		
		while(menuFlag) {
			System.out.println("----------------------------------------------");
			System.out.println("\t더조은 고등학교 1-1 성적관리");
			System.out.println("----------------------------------------------");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 리스트 출력");
			System.out.println("3. 학생 성적 검색");
			System.out.println("4. 학생 성적 수정");
			System.out.println("5. 학생 삭제");
			System.out.println("9. 프로그램 종료");
			System.out.println("----------------------------------------------");
			
						
			System.out.print("메뉴 선택(숫자)> ");
			menu = scan.nextInt();
			
			if(menu == 1) { //학생 등록				
				for (int i=countStu; i<nameList.length; i++) {
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
					
					countStu++;
					System.out.println("계속 입력 하시겠습니까(계속: 아무키나 누르세요, 종료:n)?> ");
					if(scan.next().equals("n")) {
						System.out.println("등록이 완료되었습니다.");
						break;
					}
				}
			} else if (menu == 2) { //학생 리스트 출력
				if(countStu != 0) {
					System.out.println("----------------------------------------------");
					System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
					System.out.println("----------------------------------------------");
					for (int i=0; i<countStu; i++) {
						if (nameList[i] != null) {
							System.out.print(nameList[i]+"\t");
							System.out.print(korList[i]+"\t");
							System.out.print(engList[i]+"\t");
							System.out.print(mathList[i]+"\t");
							System.out.print(totList[i]+"\t");
							System.out.print(avgList[i]+"\n");
						}
					}
				} else {
					System.out.println("등록된 데이터가 없습니다. 등록을 진행해 주세요.");
				}
				
				
			} else if (menu == 3) { //학생 성적 검색
				boolean searchFlag = true;
					while (searchFlag == true) {
						//Step 4. 데이터 조회
						//조회할 학생명 입력 받기
						System.out.print("학생명 검색> ");
						String searchName = scan.next();
						//nameList에서 입력한 학생명 검색 -> 학생의 nameList 주소를 변수에 저장한다.
						int countIdx = 0;
						int searchIdx = -1;
						
						for (String name : nameList) {
							if (name != null) {
								if (name.equals(searchName)) {
									searchIdx = countIdx;
								}else {
									countIdx++;
								}
							}
						}
						
						if (searchIdx != -1) {
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
						}else {
							System.out.println("검색한 결과가 없습니다.");
							System.out.print("계속 검색 하시겠습니까(계속: 아무키나 누르세요, 종료:n)?> ");
							if(scan.next().equals("n")) {
								searchFlag = false;
							}
						}
						
					}
				
				
			} else if (menu == 4){ //학생 성적 수정
				//수정할 학생명의 존재여부 검색
				//>유: 새로운 성적 입력 후 수정 , 무> 검색 데이터 존재x 반복 진행 여부

				//현재 데이터가 존재하지않으면 수정 X
				if (countStu !=0) {
					boolean modiFlag = true;
					while (modiFlag) {
						System.out.print("[수정] 학생명 검색> ");
						String modifiedName = scan.next();
						int modiIdx = -1;
						
						for (int i =0; i<countStu; i++) {
							if (nameList[i].equals(modifiedName)) {
								modiIdx=i;
							}
						}
						
						if (modiIdx == -1) {
							System.out.println("수정할 데이터가 존재하지 않습니다. 다시 입력해 주십시오.");
						} else {
							System.out.print("국어> ");
							korList[modiIdx]=scan.nextInt();

							System.out.print("영어> ");
							engList[modiIdx]=scan.nextInt();
							
							System.out.print("수학> ");
							mathList[modiIdx]=scan.nextInt();
							
							totList[modiIdx] = korList[modiIdx]+engList[modiIdx]+mathList[modiIdx];
							avgList[modiIdx] = (korList[modiIdx]+engList[modiIdx]+mathList[modiIdx])/3;
							
							System.out.println("수정완료");
							System.out.println("----------------------------------------------");
							System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
							System.out.println("----------------------------------------------");
							System.out.print(nameList[modiIdx]+"\t");
							System.out.print(korList[modiIdx]+"\t");
							System.out.print(engList[modiIdx]+"\t");
							System.out.print(mathList[modiIdx]+"\t");
							System.out.print(totList[modiIdx]+"\t");
							System.out.print(avgList[modiIdx]+"\n\n");
							System.out.print("계속 수정 하시겠습니까(계속: 아무키나 누르세요, 종료:n)?> ");
							if(scan.next().equals("n")) {
								modiFlag = false; //break; 종료
							}
						}
					}
				} else {
					System.out.println("수정할 데이터가 없습니다.");
				}

			} else if (menu == 5) {//학생 명 및 점수 삭제 메뉴 추가
				if (countStu !=0) {
					boolean delFlag = true;
					while (delFlag) {
						System.out.print("[삭제] 학생명 검색> ");
						String delName = scan.next();
						int delIdx = -1;
						
						for (int i =0; i<countStu; i++) {
							if (nameList[i].equals(delName)) {
								delIdx=i;
							}
						}
						
						if (delIdx == -1) {
							System.out.println("삭제할 데이터가 존재하지 않습니다. 다시 입력해 주십시오.");
						} else {
							for (int i = delIdx; i<countStu-1; i++) {//홍길동(0), 이순신(1), 김유신(2)
								nameList[i] = nameList[i+1];
								korList[i] = korList[i+1];
								engList[i] = engList[i+1];
								mathList[i] = mathList[i+1];
								totList[i] = totList[i+1];
								avgList[i] = avgList[i+1];
							}
							
							countStu--;
							System.out.println("삭제완료");
							
							System.out.print("계속 삭제 하시겠습니까(계속: 아무키나 누르세요, 종료:n)?> ");
							if(scan.next().equals("n")) {
								delFlag = false;
							}
						}
					}
				} else {
					System.out.println("수정할 데이터가 없습니다.");
				}
				
			} else if (menu == 9) { //프로그램 종료
				System.out.println("--프로그램 종료--");
				System.exit(0);
			} else {
				System.out.println("메뉴 준비중입니다.");
			}
			
			
//			System.out.println("선택 메뉴 -->> " + menu);
//			System.out.println("계속 진행 하시겠습니까(계속: 아무키나 입력해주세요, 종료:n)?> ");
//			if(scan.next().equals("n")) {
//				menuFlag = false; //break; 종료
//			}
			
			
		}//while
		
		System.out.println("--프로그램 종료--");	
			
	}

}
