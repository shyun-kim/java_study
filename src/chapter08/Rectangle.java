package chapter08;

public class Rectangle extends Shape implements ShapeInterface{
//	String color;
	int height;
	int width;
	
	public Rectangle(String color, int heigth, int width) {
//		this.color=color;
		super(color);
		this.height=heigth;
		this.width=width;
	}
	
	@Override
	public void draw() {
		System.out.println(color+" 사각형을 그린다.");
	}
	
	@Override
	public double getArea() {
		double area = 0;
		area = height*width;
		return area;
	}

}
