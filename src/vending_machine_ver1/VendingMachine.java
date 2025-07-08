package vending_machine_ver1;

import commons.Menu;

public class VendingMachine {
	String title;
	String nameList[]={"☕ 밀크커피", "☕ 아메리카노", "🍋 유자차  ", "🥛 우유   "};
	int priceList[]={300,400,300,200};
	Menu menuList[];
	
	public VendingMachine(){
		this("막심");
	}
	public VendingMachine(String title){
		this.title = title;
		System.out.println("=========="+title+" 커피 머신"+"==========");
		createMenuList();
		showMenuList();
	}

	
	//메뉴리스트 생성
	public void createMenuList() {
		menuList=new Menu[nameList.length];
		for (int i=0; i<nameList.length; i++) {
//			Menu menu=new Menu((i+1), nameList[i], priceList[i]); //구성요소들을 변수 선언해
			int no = i+1;
			String name=nameList[i];
			int price=priceList[i];
			
			Menu menu = new Menu(no,name,price);
			menuList[i]= menu;
		}
	}
	
	//메뉴 출력
	public void showMenuList() {
		for (int i=0; i<nameList.length; i++) {
			System.out.print(menuList[i].getNo()+". \t");
			System.out.print(menuList[i].getName()+"\t");
			System.out.println(menuList[i].getPrice()+"원");
		}
	}
}
