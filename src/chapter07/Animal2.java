package chapter07;

public class Animal2 { //클래스를 만드는 이유: 객체의 재사용성을 올리기 위해
	// Field: 전역변수
	String name;
	int age;
	
	// Constructor: 생성자는 오버로딩이 가능함
	public Animal2() { 
		System.out.println("객체를 생성한다.");
	}
	public Animal2(String name) { //field의 name, age 초기화
		this.name = name;
		System.out.println("객체를 생성한다.");
	}
	public Animal2(String name, int age) { //field의 name, age 초기화
		this.name = name;
		this.age = age;
		System.out.println("객체를 생성한다.");
	}
	
	
	
	//Method
	public void /*[반환타입=리턴타입]*/ sleep() {
		String date = "250703";
		System.out.println(date);
		System.out.println(name+"이(가) 잠을 잔다.");
	}
	
	
}


