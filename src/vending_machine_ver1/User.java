package vending_machine_ver1;

import java.util.Scanner;

public class User {
	//Field
	String name;
	Scanner scan;
	int resultCoin;
	
	//Constructor
	public User() {
		this("아무개");
	}
	public User(String name) {
		this.name=name;
		scan = new Scanner(System.in);
	}
	
	//Method
	//동전 입력
	public int insertCoin() {
		int coin = 0;
		System.out.print("["+name+"] 동전입력> ");
		if (scan.hasNextInt()) {
			coin = scan.nextInt();
			resultCoin = coin;		
		} else {
			System.out.println(">올바르지 않은 값입니다. 다시입력해 주세요.");
			scan.next();
			insertCoin();
		}
		return resultCoin;
	}
	
	
	
	//메뉴 입력
	public int selectMenu() {
		int menu = 0;
		System.out.print("["+name+"] 메뉴선택> ");
		if (scan.hasNextInt()) {
			menu = scan.nextInt();
		} else {
			System.out.println(">올바르지 않은 값입니다. 다시입력해 주세요.");
			scan.next();
			//selectMenu(); //?
		}
		return menu;
	}
	
	
}
