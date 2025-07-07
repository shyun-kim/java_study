package studing;

public class DrinkOrder {
	//Field
	String selMenu[]= {"☕아메리카노","🍵바닐라라떼","🥤딸기쉐이크"};
	int amount=0;
	int qty=0;
	DrinkMenu dmenu = new DrinkMenu();
	
	//Constructor
	public DrinkOrder() {
		
	}
	
	//Method
	public void selMenuCheck(int menu) {
		for(int i =0;i<selMenu.length;i++) {
			if (dmenu.menuName[menu] == selMenu[i]) {
				qty++;
				amount=dmenu.price[menu]*qty;
			}
		}
	}
	
}
