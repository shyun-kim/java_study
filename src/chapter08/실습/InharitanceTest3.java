package chapter08.실습;

public class InharitanceTest3 {
	public static void main(String[] args) {
		Circle2 cir = new Circle2("빨강");
		Rectangle2 rec = new Rectangle2("파랑");
		Triangle2 tri = new Triangle2("초록");
		
		cir.draw();
		rec.draw();
		tri.draw();
	}
}
