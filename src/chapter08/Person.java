package chapter08;

public class Person extends Client_Abstract {
	String name;
	String address;
	String phone;
	int age;
	
	public Person() {
		this("이순신","강남구","010-1234-5678", 20);
	}

	
	
	
	public Person(String name, String address, String phone, int age) {
		//name, age는 부모클래스에서 사용
		//부모 클래스의 생성자 호출 메소드 super()
//		super(name,age);
		this.name = name;
		this.age=age;
		this.address=address;
		this.phone=phone;	
	}
	
	public void personRegister() {
		System.out.println("인간 접수한다.");
	}
	
	@Override
	public void register() {
		System.out.println(name+"고객이 접수를 한다.");	
	}
	@Override
	public void payment() {}
	
	@Override
	public void printInfo() { //부모가 가진 메소드를 똑같은 모습으로 가져옴 - 오버라이딩(Overriding)
		System.out.print("고객(Person) 정보=> ");
		System.out.print(name+",");
		System.out.print(age+",");
		System.out.print(address+",");
		System.out.print(phone+"\n");
		
	}

}
