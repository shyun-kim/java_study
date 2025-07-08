package chapter07;

public class AnimalTest {
	
	String name1 = "Hong";
	
	public static void main(String[] args) {
		System.out.println("-- AnimalTest 클래스 실행! --");

		// 사자, 호랑이 객체 생성(정확히는 Animal class 파일을 호출해서 이 클래스에서 정보를 불러서 쓸수 있도록 연결해주는 인덱스 같은 것)
		// 개똥이라는 노비가 있어, 밥짓기랑 마당쓸기 할줄 알아, 근데 이름을 모르면 애가 있는데 못부르니까 일을 못시키겠지? 그래서 아래처럼 불러서 일을 시킬수 있게 하는거야
		Animal lion = new Animal();
		Animal tiger = new Animal();
		Animal giraffe = new Animal();
		Animal elephant = new Animal();
		
		Animal2 lion2 = new Animal2("심바2",5);
		Animal2 tiger2 = new Animal2("티그레");
		Animal2 elephant2 = new Animal2();
		
		Animal3 lion3 = new Animal3("심바3");
		lion3.info();
		
		
		
		lion.name = "심바";
		lion.age = 5;
		
		tiger.name="호돌이";
		tiger.age=2;
		
		giraffe.name = "기린이";
		elephant.name = "코순이";
		
		System.out.println("lion.name = "+lion.name);
		System.out.println("lion.age = "+lion.age);
		System.out.println("tiger.name = "+tiger.name);
		System.out.println("tiger.age = "+tiger.age);

//		Scanner input = new Scanner (System.in);
//		tiger.name = input.next();
//		System.out.println("tiger.name = "+tiger.name);
		
		lion.sleep();
		tiger.sleep();
		
		System.out.println("giraffe.name = "+giraffe.name);
		System.out.println("elephant.name = "+elephant.name);
		
		//생성자 초기화
		System.out.println("lion2.name = "+lion2.name);
		System.out.println("lion2.age = "+lion2.age);
		System.out.println("tiger2.name = "+tiger2.name);
		System.out.println("tiger2.age = "+tiger2.age);
		System.out.println("elephant2.name = "+elephant2.name);

	}
	
}

