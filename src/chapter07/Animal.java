package chapter07;

public class Animal { //클래스를 만드는 이유: 객체의 재사용성을 올리기 위해
	// Field: 전역변수
	String name;
	int age;
	
	// Constructor
	public Animal() { //기본 생성자:클래스 이름과 동일하고 괄호 안에 아무것도 없음 
		//생상자 호출시 실행되는 내용 => new Animal() 코드 실행 시 실행됨!
		System.out.println("객체를 생성한다.");
	}
	
//	public Animal(String name) { //기본 생성자:클래스 이름과 동일하고 괄호 안에 아무것도 없음 
//		//생상자 호출시 실행되는 내용 => new Animal() 코드 실행 시 실행됨!
//		this.name = name;
//		System.out.println(name+"객체를 생성한다.");
//	}
	
	//Method
	public void /*[반환타입=리턴타입]*/ sleep() {
		String date = "250703";
		System.out.println(date);
		System.out.println(name+"이(가) 잠을 잔다.");
	}
	
	
}


