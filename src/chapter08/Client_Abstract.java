package chapter08;

//abstract(추상) 클래스는 객체 생성이 불가능하다.
abstract public class Client_Abstract {
	//사용 불가
//	String name;
//	int age;
	
	//객체 생성이 불가능 하므로, static을 붙여 사용가능
	public static String name;
	public static int age;
	


	//Method
	//>>부모가 가진 printInfo() 메소드를 강제적으로 상속함, 그래서 {} 바디가 없음
	//오버라이드 되는 메소드는 body 없이 이름만 선언됨 >> 추상(abstract)메소드
	//추상메소드를 사용하기 위해서는 메소드 앞과, 클래스 선언 앞에 abstract을 붙여줘야함. 
	//Abstract Method를 하나라도 가지고 있으면 abstract class라고 부름 
	@Override
	
	abstract public void printInfo(); 
	

}
