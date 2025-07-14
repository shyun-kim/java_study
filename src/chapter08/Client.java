package chapter08;

//abstract(추상) 클래스는 객체 생성이 불가능하다.
abstract public class Client {
	//사용 불가
//	String name;
//	int age;
	
	//객체 생성이 불가능 하므로, static을 붙여 사용가능
	public static String name;
	public static int age;
	
//	public Client() {
//		this("홍길동", 10);
//	}
//	public Client(String name) {
//		this(name,0);
//	}
	
	//Field 가 static이 되었기 때문에 new로 생성 불가 >> private 선언 후 getInstance로 사용
//	private Client(String name, int age) {
//		this.name=name;
//		this.age=age;
//	}
//	
//	public static void getInstance(String name, int age) {
//		new Client(name, age);
//	}

	//Method
	//>>부모가 가진 printInfo() 메소드를 강제적으로 상속함, 그래서 {} 바디가 없음
	//오버라이드 되는 메소드는 body 없이 이름만 선언됨 >> 추상(abstract)메소드
	//추상메소드를 사용하기 위해서는 메소드 앞과, 클래스 선언 앞에 abstract을 붙여줘야함. 
	//Abstract Method를 하나라도 가지고 있으면 abstract class라고 부름 
	abstract public void printInfo(); 
	abstract public void register(); 
	abstract public void payment(); 
	
//		{ 
//			System.out.println("고객(client) 정보=> "+name+","+age);
//		}
}
