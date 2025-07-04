package chapter07;

import java.util.Scanner;

public class ScoreMgmSystem {
	//Field
	String admin;
	Student student;// = new Student(); //최초에 호출하는것도 가능하나, 사용 직전에 호출하는것이 메모리적으로 효율적.
	Scanner input = new Scanner(System.in);
	Student slist[] = new Student[10];
	int count = 0;
	boolean stuInput = true;
	
	
	//Cons
	public ScoreMgmSystem() {
		
	}
	
	//Method
	//메뉴 선택
	public void showMenu() {
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
		// 1.
//		int menu = input.nextInt();
//		choiceMenu(menu);

		menuCheck(input.nextInt());
		
		
	}
	
	//선택한 메뉴에 따라 기능별 메소드 호출(분기)
	public void menuCheck(int menu) {
		System.out.println("choiceMenu --> "+menu);
		
		switch(menu) {
		case 1:
			insert();
			showMenu();
			break;
		case 2:
			showList();
			showMenu();
			break;
		case 3:
			search();
			showMenu();
			break;
		case 4:
			update();
			showMenu();
			break;
		case 5:
			remove();
			showMenu();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		default :
			System.out.println("잘못된 접근입니다.");
			showMenu();
		}
	}
	
	public void insert() {
//		student=new Student();
		slist[count] = new Student();

		// >> slist[]의 count번 자리에 Student클래스를 넣어라
		//그러니까 name, kor 같은 변수들에 값이 들어가는거야
			
		System.out.print("학생명> ");
		slist[count].name=input.next();
		System.out.print("국어> ");
		slist[count].kor=input.nextInt();
		System.out.print("영어> ");
		slist[count].eng=input.nextInt();
		System.out.print("수학> ");
		slist[count].math=input.nextInt();
		System.out.println(">> 등록완료");
		count++;
		
		while (stuInput) {
			System.out.print("계속 입력하시겠습니까?(y/n)> ");
			String check = input.next();
			if(check.equals("y")) {
				insert();
			} else if (check.equals("n")) {
				showMenu();
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	public void showList() {
		if (count != 0) {
			//System.out.println("<"+(i+1)+">");
			System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
			//int i=0;
			for (Student info : slist) {
				if (info !=null) {//i<count
					System.out.print(info.name+"\t");
					System.out.print(info.kor+"\t");
					System.out.print(info.eng+"\t");
					System.out.print(info.math+"\t");
					System.out.print(info.getTot()+"\t");
					System.out.print(info.getAvg()+"\n");
					//i++;
				} else {
					break;
				}
			}
		} else {
			System.out.println("등록된 데이터가 없습니다. 정보를 등록해 주십시오.");
		}
	}
	
	public void update() {
		if (count !=0) {
			int modiIdx = searchIndex("[수정]");
			
			//String[] subjectList= {"국어","영어","수학"};
			//String name = slist[modiIdx].name; //새로 생성된 객체에 학생명 복사
			//slist[modiIdx] = new Student();
			if (modiIdx != -1) {
				System.out.print("국어> ");
				slist[modiIdx].kor=input.nextInt();
				System.out.print("영어> ");
				slist[modiIdx].eng=input.nextInt();
				System.out.print("수학> ");
				slist[modiIdx].math=input.nextInt();
				
				System.out.println("==수정완료==");
				printConsole(modiIdx);
			} else {
				System.out.println("입력한 데이터가 없습니다.");
			}
			askRepeat("수정");
		} else {
			System.out.println("수정할 데이터가 없습니다. 정보를 등록해 주십시오.");
		}
	}
	
	public void remove() {
		if (count !=0) {
			int rmIdx = searchIndex("[삭제]");
			
			if (rmIdx != -1) {
				for (int i = rmIdx; i<count; i++) {
					slist[i] = slist[i+1];
				}
				slist[rmIdx+1] = null;	
				System.out.println("==삭제 완료==");
				count--;
			} else {
				System.out.println("입력한 데이터가 검색되지 않습니다.");
			}
			askRepeat("삭제");
		} else {
			System.out.println("삭제할 데이터가 없습니다. 정보를 등록해 주십시오.");
		}
		
	}
	
	public void search() {
		if (count != 0) {
			int searchIdx = searchIndex("[검색]");
			if (searchIdx != -1) {
				System.out.println("==검색결과==");
				printConsole(searchIdx);
				askRepeat("검색");
			} else {
				System.out.println("입력한 데이터가 검색되지 않습니다.");
			}
			askRepeat("검색");
		} else {
			System.out.println("등록된 데이터가 없습니다. 정보를 등록해 주십시오.");
		}
	}
	//학생명을 검색해서 주소를 리턴하는 메소드
	public int searchIndex(String pname) {
		System.out.print(pname+"할 학생의 이름을 입력하세요.> ");
		String searchName = input.next();
		int searchIdx = -1;
		for (int i = 0; i<count; i++) {
			Student stuName = slist[i];
			if (stuName.name.equals(searchName)) {
				searchIdx=i;
			}
		}
	return searchIdx;
	}
	
	public void askRepeat(String pname) {
		while (stuInput) {
			System.out.print("계속 "+pname+" 하시겠습니까?(y/n)> ");
			String check = input.next();
			if(check.equals("y")) {
				remove();
			} else if (check.equals("n")) {
				showMenu();
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	public void printConsole(int num) {
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
		System.out.print(slist[num].name+"\t");
		System.out.print(slist[num].kor+"\t");
		System.out.print(slist[num].eng+"\t");
		System.out.print(slist[num].math+"\t");
		System.out.print(slist[num].getTot()+"\t");
		System.out.println(slist[num].getAvg()+"\t");
	}
	
}
