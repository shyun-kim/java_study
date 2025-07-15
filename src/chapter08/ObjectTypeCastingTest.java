package chapter08;

public class ObjectTypeCastingTest {

	public static void main(String[] args) {
		 Circle yellowC = new Circle("노랑",1); //color가 있어 실행시 부모 클래스를 갖고 있음
		 Rectangle blueR = new Rectangle("파랑",1,2);
		 
		 Shape s = new Circle("초록색",2); //부모(상위)클래스 참조변수 = new 자식(하위) 생성자();
		 //s는 Circle 모양의 Shape 타입 클래스가 되며, Shape에서 가지고있는 color만 활성화 됨
		 
		 Circle cs = (Circle)s; //강제 (명시적)형변환 가능
		 //Shape 타입이지만 Circle 모양으로 만들어 졌기 때문에 Circle 타입으로 명시적 형 변환 가능
//		 Rectangle t = new Circle("초록색",2); > Circle과 Rectangle은 다른 클래스이기 때문에 오류
//		 Rectangle r = (Rectangle)s; //s는 Circle 모양의 클래스로 생성되어 Rectangle로 변환 불가
		 
		 Shape s2 = new Shape("빨강");
//		 Circle cs2 = (Circle)s2; //강제 (명시적)형변환 불가능
		 
		 //인터페이스를 통해 자식의 모습으로 객체를 구현하는 것을 권장함
		 ShapeInterface si = new Circle("코랄",2);
		 si.draw();
		 System.out.println(si.getArea());
		 System.out.println();
		 
		 Circle cs3 = (Circle)si;
		 cs3.draw();
		 System.out.println(cs3.getArea());
		 System.out.println();
		 
		 //상속받은 인터페이스를 통한 객체 생성
		 ShapeInterface ri = new Rectangle("무라사키",1,2);
		 ri.draw();
		 System.out.println(ri.getArea());
		 System.out.println();
		 
		 ShapeInterface ti = new Triangle("올리브");
		 ti.draw();
		 System.out.println(ti.getArea());
		 System.out.println();
		 
		 cs.draw();
//		 cs2.draw();
		 
		 
		 yellowC.draw();
		 blueR.draw();
//		 s.draw(); //Shape 클래스는 draw() 메소드를 정의하지 않아 미 실행됨
		 System.out.println(s.color);
	}

}
