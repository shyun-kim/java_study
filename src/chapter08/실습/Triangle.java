package chapter08.실습;

public class Triangle extends Shape implements ShapeInterface{
//	String color;
	
	public Triangle(String color) {
		super(color);
//		this.color=color;
		
	}
	
	@Override
	public void draw() {
		System.out.println(color+" 삼각형을 그린다.");
	}
	
	@Override
	public double getArea() {
		
		return 0.0;
	}
	
}
