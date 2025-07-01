package chapter06;

import java.util.Scanner;

/*
 * 더조은 레스토랑 메뉴 등록/출력/검색 프로그램
 * 메뉴는 피자, 햄버거, 라멘, 샐러드
 * 메뉴명, 이모지, 메뉴가격을 저장
 * 메뉴명, 이모지, 가격은 각각 1차원 배열로 생성하여 관리
 * 메뉴 관리를 위해 각 배열의 주소값을 통일 시킨다.
 */

public class MenuTestVer1 {
	public static void main (String[] args) {
		// 0.선언부
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴 개수> ");
		boolean menuSize = true;
		final int MAX_SIZE = scan.nextInt();
		
//		int MAX_SIZE;
//		while (menuSize) {
//			if (scan.hasNextInt()) {
//				MAX_SIZE = scan.nextInt();
//				menuSize=false;
//			} else {
//				System.out.println("다시입력해 주십시오");
//			}
//		}
		
		
		String menuNameList[] = new String[MAX_SIZE]; 
		String emojiNameList[] = new String[MAX_SIZE]; 
		int priceList[] = new int[MAX_SIZE]; 
		
		// 1. 메뉴 등록/출력/검색/종료
		boolean menuFlag = true;
		int menu = 0;
		int menuCount=0;
		
		while (menuFlag) {
			System.out.println("----------------------------------------------");
			System.out.println("\t더조은 레스토랑 메뉴 관리 프로그램");
			System.out.println("----------------------------------------------");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴 리스트 출력");
			System.out.println("3. 메뉴 검색");
			System.out.println("9. 프로그램 종료");
			System.out.println("----------------------------------------------");
			
			System.out.print("메뉴선택(숫자)> ");
			menu = scan.nextInt();
			
			if (menu == 1) {
				//저장공간 크기만큼 반복수행, 메뉴하나 등록완료시 카운트
				//저장공간 크기가 부족하면 메세지 출력 후 종료 
				
				if (menuCount == MAX_SIZE) {
					System.out.println("저장공간이 부족합니다.");
				} else {
					System.out.println("--메뉴 등록--");
					for (int i=menuCount; i<MAX_SIZE; i++) {
						System.out.print("메뉴 이름> ");
						menuNameList[i] = scan.next();
						
						System.out.print("이모지> ");
						emojiNameList[i] = scan.next();

						System.out.print("가격> ");
						priceList[i] = scan.nextInt();
						
						menuCount++;
						
						if (menuCount == MAX_SIZE) {
							System.out.println(">> 저장이 완료되었습니다.");
						} else {
							System.out.print("계속 입력 하시겠습니까(계속: 아무키나 누르세요, 종료:n)?> ");
							if(scan.next().equals("n")) {
								System.out.println(">> 등록이 완료되었습니다.");
								break;
							}
						}
					}
				}	
				
			} else if (menu == 2) {
				if (menuCount != 0) {
					System.out.println("--메뉴 리스트 출력--");
					System.out.println("----------------------------------------------");
					System.out.println("메뉴 이름\t이모지\t가격");

					for (int i=0; i<menuNameList.length; i++) {
						if (menuNameList[i] != null) {
							System.out.print(menuNameList[i]+"\t");
							System.out.print(emojiNameList[i]+"\t");
							System.out.print(priceList[i]+"\n");
						}
					}
					System.out.println();
				} else {
					System.out.println(">> 등록된 정보가 없습니다. 메뉴를 등록해 주십시오.");
				}
				
			} else if (menu == 3) {
				System.out.println("--메뉴 검색--");
				
				if (menuNameList[0] != null) {
					boolean searchFlag = true;
					while (searchFlag) {
						System.out.print("메뉴 이름 검색> ");
						String searchName = scan.next();

						int searchIdx = -1;
						int countIdx = 0;
						
						for (String name : menuNameList)/*(int i=0; i<menuCount;i++)*/ {
							if (searchName.equals(name/*menuNameList[i]*/)) {
								searchIdx = countIdx;
								countIdx++;
							}
						}

						if (searchIdx != -1) {
							System.out.print("검색 결과 주소: "+searchIdx+"\n");
							
							//Step 5. 데이터 조회 결과 출력
							System.out.println("----------------------------------------------");
							System.out.println("\t검색결과");
							System.out.println("----------------------------------------------");
							System.out.println("메뉴 이름\t이모지\t가격");
							System.out.print(menuNameList[searchIdx]+"\t");
							System.out.print(emojiNameList[searchIdx]+"\t");
							System.out.print(priceList[searchIdx]+"\n");
							
							System.out.print("계속 검색 하시겠습니까(계속: 아무키나 누르세요, 종료:n)?> ");
							if(scan.next().equals("n")) {
								System.out.println(">> 검색을 종료합니다.");
								searchFlag = false;
							}
						} else {
							System.out.println(">> 등록된 정보가 없습니다. 메뉴를 등록해 주십시오.");
						}
					} 
				} else {
					System.out.println(">> 등록된 정보가 없습니다. 메뉴를 등록해 주십시오.");
					}
				
			} else if (menu == 9) {
				System.out.println("--프로그램 종료--");
				System.exit(0);
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			
			
			
		}//메뉴출력while
		
	}

}
