package commons;

public class Menu {
	public int no;
	public int price;
	public String name;
	
	public Menu() {}
	public Menu(int no, String name, int price) {
		this.no=no;
		this.name=name;
		this.price=price;		
	}
	
	public int getNo() {return no;}
	public String getName() {return name;}
	public int getPrice() {return price;}
	
	
}
