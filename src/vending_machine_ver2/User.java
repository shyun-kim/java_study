package vending_machine_ver2;

import java.util.Scanner;

public class User {
	//사용자 이름, 입력을 위한 스캐너 객체
	String name;
	Scanner scan;
	int insertTotal=0;
	VendingMachine vm=new VendingMachine();
	
	public User() {
		this("아무개");
	}
	public User(String name) {
		scan=new Scanner(System.in);
		this.name=name;
	}
	
	
	//getter 메소드 생성
	public String getName() {return name;}
	public Scanner getScan() {return scan;}
	
	public int insertedCoinCheck() {
		System.out.print(name+"님, 동전을 넣어주세요.> ");
		if(scan.hasNextInt()) {
			int coin = scan.nextInt();
			if (coin == 100 || coin == 500) {
				insertTotal += coin;
			} else {
				coinReturn();
			}
		} else {
			scan.next();
			coinReturn();
		}
		return insertTotal;
	}
	
	public void coinReturn() {
		System.out.println("동전을 인식할 수 없습니다.");
		insertedCoinCheck();
	}
	
	
	
	public int menuSel() {
		int menuNum=-1;
		System.out.println("주문할 항목 번호를 입력해 주세요> ");
		int sel;
		if (scan.hasNextInt()) {
			sel=scan.nextInt();
			if (sel >=1 && sel<=4) {
				menuNum=sel;
			} else {
				System.out.println("메뉴에 없는 항목입니다.");
				vm.askOrder(0);
			}
		} else {
			System.out.println("잘못된 입력입니다.");
			scan.next();
			menuSel();
		}
		return menuNum;
	}
	
	
}
