package chapter08;

public class Animal extends Client_Abstract {
//	String name;
//	int age;
	Person owner;

	public Animal() {
		this("예삐",3, null);
	}
	public Animal(String name, int age, Person owner) {
		this.name = name;
		this.age =age;
//		super(name, age);
		this.owner=owner;
	}
	
	public void sound() {
		System.out.println(name+" 짖는다");
	}
	
	public void animalRegistor() {
		System.out.println("접수한다.");	
	}
	
	public void register() {
		System.out.println(owner.name+" 접수를 한다.");	
	}
	
	@Override
	//고객 정보 출력시 owner 정보 포함 >> Client 클래스에는 owner 정보가 없기 때문에 Animal(자식) 쪽에서 메소드 작성 필요
	public void printInfo() { //부모가 가진 메소드를 똑같은 모습으로 가져옴 - 오버라이딩(Overriding)
		System.out.print("고객(Animal) 정보=> ");
		System.out.print(owner.name+",");
		System.out.print(owner.age+"\ntih");
	}
	
}
