package chapter21_miniproject.application;

import java.util.Scanner;

import chapter21_miniproject.model.MemberVo;
import chapter21_miniproject.service.ProjectService;

public class ProjectApplication {
	Scanner scan = new Scanner(System.in);
	MemberVo member;
	ProjectService service = new ProjectService();
	
	static final int CHECKCUSTOMER = 1;
	static final int CHECKCART = 2;
	static final int RESETCART = 3;
	static final int ADDITEM = 4;
	static final int REDUCEITEM = 5;
	static final int DELETEITEM = 6;
	static final int RECEIPT = 7;
	static final int EXIT = 8;
	
	public void inputName() {
		member = new MemberVo();
		System.out.print("당신의 이름을 입력하세요 : ");
		member.setName(scan.next());
		System.out.print("연락처를 입력하세요 : ");
		member.setPhone(scan.next());
		
	}
	public void showMenu() {
		System.out.println("*********************************");
		System.out.println("	Welcome to Shopping Mall");
		System.out.println("	Welcome to Book Market");
		System.out.println("*********************************");
		System.out.println("1. 고객 정보 확인하기\t\t2.장바구니 상품 목록 보기");
		System.out.println("3. 장바구니 비우기\t\t4. 바구니에 항목 추가하기");
		System.out.println("5. 장바구니의 항목 수량 줄이기\t6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기\t\t8. 종료");
		System.out.println("*********************************");
	}
	
	public void selectMenu() {
		int select;
		System.out.print("메뉴 번호를 선택해 주세요> ");
		select = scan.nextInt();
		System.out.println(select+"번을 선택했습니다. \n");
		
		service.showList();
		switch(select) {
			case CHECKCUSTOMER:
				service.checkCustomer();
				break;
			case CHECKCART:
				service.checkShoppingCart();
				break;
			case RESETCART:
				service.resetShoppingCart();
				break;
			case ADDITEM:
				service.addItemShoppingCart();
				break;
			case REDUCEITEM:
				service.reduceItemShoppingCart();
				break;
			case DELETEITEM:
				service.deleteItemShoppingCart();
				break;
			case RECEIPT:
				service.showReceipt();
				break;
			case EXIT:
				service.close();
				break;

		}
	}
	
	public ProjectApplication() {
		inputName();
		showMenu();
		selectMenu();
	}
	
	public static void main(String[] args) {
		new ProjectApplication();
	}

}
