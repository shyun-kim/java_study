package chapter08.실습;

public class Rectangle2 extends Shape2 implements Shapeinterface2{
//	String color;
	
	public Rectangle2(String color) {
//		this.color=color;
		super(color);
	}

	public void draw() {
		System.out.println(color+"색 사각형을 그린다.");
	}
}
