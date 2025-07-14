package chapter08.실습;

public class Triangle2 extends Shape2 implements Shapeinterface2{
//	String color;
	
	public Triangle2(String color) {
//		this.color=color;
		super(color);
	}

	public void draw() {
		System.out.println(color+"색 삼각형을 그린다.");
	}
}
