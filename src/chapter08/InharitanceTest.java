package chapter08;

public class InharitanceTest {
	public static void main (String [] args) {
//		Client c1 = new Client();
//		Animal a1 = new Animal();
		Person lee = new Person();
		Person kim = new Person("김유신","종로구","010-9876-9876",12);
		Animal dog = new Animal("명수",5,lee);
		Animal cat = new Animal("야옹이",6,kim);
		
		
		//부모인 Client의 name 변수 사용 하는 방법? 자식이 필드를 갖고 있지 않을 때 부모의 필드를 사용한다. 
		//이때, 자식이 상속한 부모클래스는 따로 생성되기 떄문에 부모 클래스의 원본에는 영향을 끼치지 않는다.
		
//		c1.name="홍길동";
//		p1.name="홍길동2"; 
//		a1.name="예삐";
		
//		System.out.println("c1.name =>"+c1.name);
//		System.out.println("p1.name =>"+p1.name);
//		System.out.println("c1.name =>"+c1.name);
//		System.out.println("a1.name =>"+a1.name);
//		System.out.println("p2.name =>"+p2.name);
		
//		c1.printInfo();
//		a1.printInfo();
		lee.printInfo();
		kim.printInfo();
		dog.printInfo();
		cat.printInfo();
		//부모와 자식이 동일한 메소드 이름을 갖고 있다면 자식의 메소드만 사용
		
		lee.register();
		cat.register();
		
		dog.sound();
		cat.sound();
	}

}
