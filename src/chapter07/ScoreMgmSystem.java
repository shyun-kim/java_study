package chapter07;

import java.util.Scanner;

public class ScoreMgmSystem {
	//Field
	String admin;
	Student student;// = new Student(); //최초에 호출하는것도 가능하나, 사용 직전에 호출하는것이 메모리적으로 효율적.
	Scanner input = new Scanner(System.in);
	Student slist[] = new Student[10];
	boolean stuInput = true;
	boolean showOuput = true;
	
	
	//Cons
	public ScoreMgmSystem() {
		
	}
	
	//Method
	public void insert() {
		student=new Student();
		int i=0;

		while(stuInput) {
				System.out.print("학생명> ");
				student.name[i]=input.next();
				System.out.print("국어> ");
				student.kor[i]=input.nextInt();
				System.out.print("영어> ");
				student.eng[i]=input.nextInt();
				System.out.print("수학> ");
				student.math[i]=input.nextInt();
				System.out.println(">> 등록완료");
				i++;
				if (i<3) {
					while (stuInput) {
						System.out.print("계속 입력하시겠습니까?(y/n)> ");
						String check = input.next();
						if(check.equals("y")) {
							break;
						} else if (check.equals("n")) {
							stuInput = false;
						}
						else {
							System.out.println("잘못된 입력입니다.");
						}
					}
				}else {
					System.out.println("현재 3명까지 입력 가능합니다");
					stuInput = false;
				}
		}
	}
	public void show() {
		int i=0;
		for (int j=0;j<3;j++) {
			System.out.println("<"+(i+1)+">");
			System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
			System.out.print(student.name[i]+"\t");
			System.out.print(student.kor[i]+"\t");
			System.out.print(student.eng[i]+"\t");
			System.out.print(student.math[i]+"\t");
			student.getTot();
			System.out.print(student.tot[i]+"\t");
			student.getAvg();
			System.out.print(student.avg[i]+"\n");
			i++;
		}
		
	}
	
	public void update() {
		System.out.println("update");
	}
	public void remove() {
		System.out.println("remove");
	}
	public void search() {
		System.out.println("search");
	}
}
