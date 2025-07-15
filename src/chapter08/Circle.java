package chapter08;

public class Circle extends Shape implements ShapeInterface { //클래스는 단일 상속만 가능하기 때문에 추상메소드를 위한 interface 사용
//	String color;
	int radius;
	static public final double PI=3.14; //static은 왜 붙이는건지 모르겠네
	
	public Circle(String color, int radius) {
		super(color);		
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println(color+" 원을 그린다.");
	}
	
	@Override
	public double getArea() {
		double area = 0;
		area = radius*radius*PI;
		return area;
	}

}
