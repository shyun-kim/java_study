package chapter08.실습;

public class Circle2 extends Shape2 implements Shapeinterface2{
//	String color;
	
	public Circle2(String color) {
//		this.color=color;
		super(color);
	}
	
	public void draw() {
		System.out.println(color+"색 원을 그린다.");
	}

}
