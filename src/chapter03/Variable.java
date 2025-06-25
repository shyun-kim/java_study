package chapter03;

//import java.lang.String;
//자주 사용하는 lang class 같은 것들은 자동으로 import 되어 있다.
//lang을 제외한 다른 라이브러리는 import를 해야함

public class Variable {
	public static void main(String[] args) {
		// 기본 자료형 변수 정의
		int age = 9;
		double aged = 10.0;
		boolean flag = true;
		char name = '홍';
		char name2 = '길';
		char name3 = '동';
		String sname = "홍길동";
		
		//참조 자료형 변수 정의
		String sname2=
				new String("홍길동2");
		
		//String 클래스는 기본형과 참조형 모두 사용가능
		String sname3 = "I'm 홍길동";
		
		//출력 파트
		System.out.println("age is "+age); 
		System.out.println("aged is "+aged);
		System.out.println(flag);
		System.out.print(name);
		System.out.print(name2);
		System.out.println(name3);
		System.out.println(sname);
		System.out.println(sname2);
		System.out.println(sname3);
				
	}

}
