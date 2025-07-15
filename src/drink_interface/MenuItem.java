package drink_interface;

public class MenuItem implements Menu{
	public int no;
	public int price;
	public String name;
	
	public MenuItem() {}
	public MenuItem(int no, String name, int price) {
		this.no=no;
		this.name=name;
		this.price=price;		
	}
	
	@Override
	public int getNo() {return no;}
	
	@Override
	public String getName() {return name;}
	
	@Override
	public int getPrice() {return price;}
	
	
}
