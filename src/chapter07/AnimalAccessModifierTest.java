package chapter07;

import commons.Animal;
import java.util.Calendar;

public class AnimalAccessModifierTest {

	public static void main(String[] args) {
		//Calendar 객체 생성?
//		Calendar c = new Calendar(); //>>상속관계가 없으므로 객체생성 불가
		Calendar c = Calendar.getInstance(); //생성된 객체의 인스턴스 주소를 가져옴(Singleton)
		System.out.println(c.getTime()); //생성자(new @())없음
		
		AnimalAccessModifier aam = new AnimalAccessModifier("호순이",4);
		Animal comDog = new Animal();
		
		comDog.setName("예삐"); //패키지가 다르므로, 원본 클래스에서 public 선언하징 않으면 접근 불가
		comDog.setAge(3);
		
		aam.name="홍길동";
		aam.age=5;

//		aam.pname="호순이";	//private라서 접근 불가
//		aam.page=4;			//private라서 접근 불가

		System.out.println("name = "+aam.name);
		System.out.println("age = "+aam.age);
		System.out.println("pname = "+aam.getPname());
		System.out.println("page = "+aam.getPage());
		System.out.println("name = "+comDog.getName());
		System.out.println("age = "+comDog.getAge());
		
		
		//final 변수 테스트
//		aam.fname = "홍길순";  >> final 키워드 변수는 외부에서 값을 변경 할 수 없다.
//		aam.fage=2;
		
		//상수 호출
		int start = AnimalAccessModifier.START;
		int con = AnimalAccessModifier.CONTINUE;
		int end = AnimalAccessModifier.END;
		
	}

}
